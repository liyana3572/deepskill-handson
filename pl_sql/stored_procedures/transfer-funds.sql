CREATE OR REPLACE PROCEDURE TransferFunds (
    p_fromAccount IN NUMBER,
    p_toAccount   IN NUMBER,
    p_amount      IN NUMBER
) AS
    v_currentBalance NUMBER;
BEGIN
    SELECT Balance INTO v_currentBalance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_currentBalance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: insufficient balance in Account ' || p_fromAccount);
    ELSE
        UPDATE Accounts
        SET Balance = Balance - p_amount, LastModified = SYSDATE
        WHERE AccountID = p_fromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_amount, LastModified = SYSDATE
        WHERE AccountID = p_toAccount;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_fromAccount || ' to Account ' || p_toAccount);
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Source account not found.');
END TransferFunds;
/