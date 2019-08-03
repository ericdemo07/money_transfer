CREATE TABLE Accounts(
Id UUID,
CurrentBalance DECIMAL,
AccountStatus ENUM('ACTIVE','DEACTIVE','BLOCKED','UNDER_SCRUTINY'),
CreatedAt TIMESTAMP WITH TIME ZONE
);

SHOW COLUMNS FROM Accounts;

SELECT CurrentBalance, AccountStatus, CreatedAt FROM Accounts WHERE Id = :Id;

--
-- CREATE TABLE Accounts(
-- Id UUID,
-- CurrentBalance DECIMAL,
-- AccountStatus  varchar(32) check (AccountStatus IN ('ACTIVE','DEACTIVE','BLOCKED','UNDER_SCRUTINY')),
-- CreatedAt TIMESTAMP WITH TIME ZONE
-- );
