import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Cash atmcash = new Cash();
        HashMap<Integer,Integer> cash = new HashMap<>();
        cash.put(1000,20);
        cash.put(500,100);
        cash.put(100,300);
        atmcash.feedCash(cash);
        //feeding cash
        System.out.println("Initial cash : "+atmcash.getAvailabeCash());

        //adding customers
        HashMap<Integer,Customer> customers = new HashMap<>();
        addCustomers(customers);
        printCustomers(customers);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your acc number");
        int accNo =sc.nextInt();
        System.out.println("Enter your pin");
        int pin =sc.nextInt();
        Customer c= findCustomer(accNo,customers);
        if(c==null) System.out.println("Invalid Acc Number");
        if(c.getPin() == pin){
            performOperations(c,atmcash,customers);
        }
        else{
            System.out.println("PIN wrong");
        }


    }
    public static void addCustomers(HashMap<Integer,Customer> customers){
        Customer c1 = new Customer(101,"Suresh",2343,25234);
        Customer c2 = new Customer(102,"Ganesh",5432,34123);
        Customer c3 = new Customer(103, "Magesh",7854,26100);
        Customer c4 = new Customer(104,"Naresh",2345,80000);
        Customer c5 = new Customer(105,"Harish",1907,103400);

        customers.put(c1.getAccNo(),c1);
        customers.put(c2.getAccNo(),c2);
        customers.put(c3.getAccNo(),c3);
        customers.put(c4.getAccNo(),c4);
        customers.put(c5.getAccNo(),c5);
    }

    public static void printCustomers(HashMap<Integer,Customer> customers){
        System.out.println("Acc No      Name         Pin      Balance");
        for(Map.Entry<Integer,Customer> c: customers.entrySet()){
            System.out.print(c.getValue().getAccNo()+"        ");
            System.out.print(c.getValue().getName()+"        ");
            System.out.print(c.getValue().getPin()+"    ");
            System.out.print(c.getValue().getAccountBalance()+"    ");
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public  static Customer findCustomer(int accNo,HashMap<Integer,Customer> customers){
        return customers.getOrDefault(accNo,null);
    }


    public static void performOperations(Customer c,Cash atmcash,HashMap<Integer,Customer> customers){
        System.out.println("Available Options \n 1. Check Balance \n 2.Withdraw Money \n 3. Transfer Money \n 4.Mini Statement ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice =sc.nextInt();
        System.out.println("Selected Option: "+choice);
        switch (choice){
            case 1:
                displayBalance(c);
                break;
            case 2:
                withdraw(c,atmcash);
                break;
            case 3:
                System.out.println("Enter to acc no");
                int toacc= sc.nextInt();
                System.out.println("Enter the amount");
                int amount = sc.nextInt();
                Customer to = findCustomer(toacc,customers);
                transfer(c,to,amount);
                break;

            default:
                break;
        }
    }
    public static void displayBalance(Customer c){
        System.out.println("Available Balance: "+c.getAccountBalance());
    }

    public static void withdraw(Customer c,Cash atmcash){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount  = sc.nextInt();
        if (amount<100){
            System.out.println("AMount should be greater than 100");
        } else if (amount>10000) {
            System.out.println("Amount should be less than 10000");
        }
        else{
            System.out.println(atmcash.getAvailabeCash());
            if (atmcash.getAvailabeCash()<amount){
                System.out.println("Cash Insufficient in ATM");
            }
            else{
                if(amount<=c.getAccountBalance()){
                    if(amount>=5000){
                        withdrawabove5k(amount,c,atmcash);
                    }
                    else {
                        withdrawlessthan5k(amount,c,atmcash);
                    }
                    System.out.println(c.getAccountBalance());

                }
                else{
                    System.out.println("Insufficient balance");
                }
            }

        }
    }
    public static void withdrawlessthan5k(int amount, Customer c,Cash atmcash){
        HashMap<Integer,Integer> denom = atmcash.getDenominations();
        int temp = amount;
       
        // loggic to dispense cash less than 5k

        atmcash.updateDenomination(denom);
        c.updateBalance(c.getAccountBalance()-temp);
        atmcash.updateAvailableCash(atmcash.getAvailabeCash()-temp);
        System.out.println(c.getAccountBalance());
        System.out.println(atmcash.getAvailabeCash());
    }
    public static void withdrawabove5k(int amount, Customer c,Cash atmcash){
            int temp = amount;
            HashMap<Integer,Integer> denom = atmcash.getDenominations();
            

            // logic to dispense cash above 5k

            atmcash.updateDenomination(denom);
            c.updateBalance(c.getAccountBalance()-temp);
            atmcash.updateAvailableCash(atmcash.getAvailabeCash()-temp);
            System.out.println(c.getAccountBalance());
            System.out.println(atmcash.getAvailabeCash());
    }
    public static void transfer(Customer from, Customer to, int amount){
        if (amount<=from.getAccountBalance()){
            from.updateBalance(from.getAccountBalance()-amount);
            to.updateBalance(to.getAccountBalance()+amount);
            System.out.println("Updated balance of from acc: "+from.getAccountBalance());
            System.out.println("Updated balance of to acc:"+to.getAccountBalance());
        }
        else{
            System.out.println("Insufficient balance");
        }

    }
}
