import java.util.*;
public class Cash {
    private HashMap<Integer,Integer> denominations = new HashMap<>();
    private int availabeCash;

    public boolean feedCash(HashMap<Integer,Integer> cash){
        try{
            for (Map.Entry<Integer,Integer> entry: cash.entrySet()){
                int note = entry.getKey();
                int count = entry.getValue();
                denominations.put(note,denominations.getOrDefault(note,0)+count);
                availabeCash += note*count;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int getAvailabeCash() {
        return availabeCash;
    }

    public HashMap<Integer,Integer> getDenominations(){
        return denominations;
    }
    public boolean updateDenomination(HashMap<Integer,Integer> updated){
        this.denominations =updated;
        return true;
    }
    public void updateAvailableCash(int n){
        availabeCash =n;
    }
    public boolean feedLakhs(int n){
        Cash atm = new Cash();
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> cash = new HashMap<>();
            cash.put(1000,20);
            cash.put(500,100);
            cash.put(100,300);
            atm.feedCash(cash);
//            System.out.println(atm.feedCash(cash));
//            System.out.println(atm.getDenominations());
//            System.out.println(atm.getAvailabeCash());
        }
        return true;
    }
}
