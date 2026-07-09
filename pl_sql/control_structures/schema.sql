CREATE TABLE Customers (
    CustomerID   NUMBER PRIMARY KEY,
    Name         VARCHAR2(100),
    DOB          DATE,
    Balance      NUMBER,
    LastModified DATE,
    IsVIP        VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE Accounts (
    AccountID    NUMBER PRIMARY KEY,
    CustomerID   NUMBER REFERENCES Customers(CustomerID),
    AccountType  VARCHAR2(20),
    Balance      NUMBER,
    LastModified DATE
);

CREATE TABLE Transactions (
    TransactionID   NUMBER PRIMARY KEY,
    AccountID       NUMBER REFERENCES Accounts(AccountID),
    TransactionDate DATE,
    Amount          NUMBER,
    TransactionType VARCHAR2(20)
);

CREATE TABLE Loans (
    LoanID       NUMBER PRIMARY KEY,
    CustomerID   NUMBER REFERENCES Customers(CustomerID),
    LoanAmount   NUMBER,
    InterestRate NUMBER,
    StartDate    DATE,
    EndDate      DATE
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name       VARCHAR2(100),
    Position   VARCHAR2(50),
    Salary     NUMBER,
    Department VARCHAR2(50),
    HireDate   DATE
);


COMMIT;
