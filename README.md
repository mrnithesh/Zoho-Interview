# Zoho Interview Solutions 🚀

This repository contains my solutions for the **Zoho SDE (Software Development Engineer)** interview rounds. The solutions are organized by interview levels and showcase problem-solving skills in Java programming.

## 📁 Repository Structure

```
Zoho-Interview/
├── L2/                          # Level 2 Interview Solutions
│   ├── src/
│   │   ├── GenerateParanthesis.java
│   │   ├── HappyNumber.java
│   │   ├── LongestConsecutiveSequence.java
│   │   ├── ReversePolishNotation.java
│   │   └── ValidParanthesis.java
│   └── Zoho-Interview.iml
├── L3/                          # Level 3 Interview Solutions (ATM System)
│   ├── src/
│   │   ├── ATM.java            # Main ATM class (incomplete)
│   │   ├── Cash.java           # Cash management
│   │   ├── Customer.java       # Customer entity
│   │   └── Transaction.java    # Transaction handling (incomplete)
│   └── ATMProcess.iml
└── README.md
```

## 🎯 Level 2 (L2) Solutions - **COMPLETED** ✅

### 1. Generate Parenthesis

**Problem**: Generate all combinations of well-formed parentheses for `n` pairs.

- **Approach**: Recursive backtracking with constraint validation
- **Time Complexity**: O(4^n / √n)
- **Space Complexity**: O(4^n / √n)

### 2. Happy Number

**Problem**: Determine if a number is a happy number (sum of squares of digits eventually equals 1).

- **Approach**: Iterative digit processing with cycle detection
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)

### 3. Longest Consecutive Sequence

**Problem**: Find the length of the longest consecutive elements sequence in an unsorted array.

- **Approach**: HashSet for O(1) lookup with intelligent starting point detection
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 4. Reverse Polish Notation (RPN)

**Problem**: Evaluate arithmetic expressions in postfix notation.

- **Approach**: Stack-based evaluation with operator precedence handling
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

### 5. Valid Parentheses

**Problem**: Check if a string of brackets is properly balanced and nested.

- **Approach**: Stack with HashMap for bracket mapping
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

## 🏗️ Level 3 (L3) Solutions - **IN PROGRESS** ⚠️

### ATM Management System

A comprehensive ATM simulation system demonstrating object-oriented design principles.

#### Completed Components:

- ✅ **Customer Management**: Account creation, authentication, balance tracking
- ✅ **Cash Management**: Denomination handling, cash feeding, availability tracking
- ✅ **Basic Operations**: Balance inquiry, money transfer
- ✅ **User Interface**: Console-based interaction with menu system

#### Features Implemented:

- Customer authentication (Account number + PIN)
- Multiple customer support with pre-loaded data
- Cash denomination management (₹100, ₹500, ₹1000 notes)
- Fund transfer between accounts
- Balance inquiry
- Input validation (withdrawal limits: ₹100 - ₹10,000)

#### Incomplete/TODO Features:

- **Optimal Cash Dispensing Logic**: Algorithm for optimal note distribution
- **Transaction History**: Complete transaction logging and mini-statements

#### Class Structure:

```java
ATM.java       // Main controller with user interaction
├── Customer.java    // User entity with account details
├── Cash.java        // Cash management and denomination tracking
└── Transaction.java // Transaction logging (skeleton only)
```

## 🛠️ Technologies Used

- **Language**: Java
- **Development Environment**: IntelliJ IDEA
- **Design Patterns**: Object-Oriented Programming (OOP)
- **Data Structures**: HashMap, Stack, HashSet, ArrayList

## 📊 Test Cases & Examples

### L2 Solutions Include:

- **Generate Parenthesis**: `n=1` → `["()"]`, `n=3` → `["((()))","(()())","(())()","()(())","()()()"]`
- **Happy Number**: `19` → `true`, `2` → `false`
- **Longest Consecutive**: `[100,4,200,1,3,2]` → `4` (sequence: 1,2,3,4)
- **RPN Evaluation**: `["2","1","+","3","*"]` → `9`
- **Valid Parentheses**: `"([{}])"` → `true`, `"([)]"` → `false`

## 🎯 Interview Experience

- **L2 Round**: Focused on algorithmic problem-solving and data structure optimization
- **L3 Round**: System design and object-oriented programming concepts

## 📝 Notes

- All L2 solutions are optimized for time and space complexity
- L3 system follows OOP principles with clear separation of concerns
- Code includes debugging outputs for development and testing
- ATM system designed to be extensible for additional features

---

**Disclaimer**: These are my personal solutions developed during the Zoho interview process (sep 2025). The L3 solution is incomplete as mentioned and represents work in progress.


## 🤝 Contributing

Feel free to **fork** this repository and add your own solutions! Contributions are welcome in the following areas:

### 🔧 Areas for Improvement:
- **Complete the ATM System**: Implement optimal cash dispensing algorithm and transaction history
- **Optimize L2 Solutions**: Alternative approaches or performance improvements
- **Add New Problems**: Additional Zoho interview questions and solutions
- **Test Cases**: Comprehensive unit tests for all solutions
- **Documentation**: Enhanced code comments and explanations

### 📋 How to Contribute:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-solution`)
3. Implement your changes
4. Add tests and documentation
5. Submit a pull request

### 💡 Suggestions Welcome:
- Alternative algorithmic approaches
- Code optimization techniques
- Additional system design features
- Better error handling and edge cases

**Happy coding!** 🎉