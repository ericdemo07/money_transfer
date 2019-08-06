--accounts
CREATE TABLE Accounts(
Id UUID NOT NULL DEFAULT RANDOM_UUID() PRIMARY KEY,
CurrentBalance DECIMAL NOT NULL DEFAULT 0.00,
AccountStatus ENUM('ACTIVE','DEACTIVE','BLOCKED','UNDER_SCRUTINY') NOT NULL DEFAULT 'UNDER_SCRUTINY',
CreatedAt TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('1dc09382-b872-11e9-a2a3-2a2ae2dbcce4', 2373271.00, 'ACTIVE');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('781a4bdc-93ba-4e37-9376-ecdc315ea352', 534223.00, 'DEACTIVE');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('dc19b810-b870-11e9-a2a3-2a2ae2dbcce4', 43242432.00, 'BLOCKED');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('e0376ff0-b870-11e9-a2a3-2a2ae2dbcce4', 24345666.00, 'UNDER_SCRUTINY');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 3213213.00, 'ACTIVE');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('65e65a27-89cf-473d-8e31-526264db78e3', 6564532.00, 'ACTIVE');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', 12345609.00, 'ACTIVE');

INSERT INTO Accounts(Id, CurrentBalance, AccountStatus)
VALUES ('34e65a27-89cf-473d-8e31-526224db78e3', 323232.00, 'UNDER_SCRUTINY');


--transactions
CREATE TABLE Transactions(
Id UUID NOT NULL DEFAULT RANDOM_UUID() PRIMARY KEY,
DebitAccountId UUID NOT NULL REFERENCES Accounts(Id),
CreditAccountId UUID NOT NULL REFERENCES Accounts(Id),
Amount DECIMAL NOT NULL DEFAULT 0.00,
TransactionType ENUM('NEFT','IMPS','OTHER_ELECTRONIC') NOT NULL DEFAULT 'OTHER_ELECTRONIC',
CreatedAt TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('cc3ac924-b871-11e9-a2a3-2a2ae2dbcce4','65e65a27-89cf-473d-8e31-526264db78e3', 'e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', 231.00, 'NEFT');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('d2379384-b871-11e9-a2a3-2a2ae2dbcce4','1679d922-b871-11e9-a2a3-2a2ae2dbcce4', '65e65a27-89cf-473d-8e31-526264db78e3', 42.00, 'IMPS');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('d6b74b3e-b871-11e9-a2a3-2a2ae2dbcce4','65e65a27-89cf-473d-8e31-526264db78e3', '1dc09382-b872-11e9-a2a3-2a2ae2dbcce4', 4322.00, 'NEFT');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('dd17e790-b871-11e9-a2a3-2a2ae2dbcce4','e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', '1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 321.00, 'IMPS');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('e095a5a6-b871-11e9-a2a3-2a2ae2dbcce4','65e65a27-89cf-473d-8e31-526264db78e3', 'e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', 423.00, 'OTHER_ELECTRONIC');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('e4c5b85a-b871-11e9-a2a3-2a2ae2dbcce4','1dc09382-b872-11e9-a2a3-2a2ae2dbcce4', '65e65a27-89cf-473d-8e31-526264db78e3', 645.00, 'NEFT');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('e8751798-b871-11e9-a2a3-2a2ae2dbcce4','1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 'e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', 323.00, 'IMPS');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('ec1a427e-b871-11e9-a2a3-2a2ae2dbcce4','65e65a27-89cf-473d-8e31-526264db78e3', '1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 788.00, 'NEFT');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('efed6336-b871-11e9-a2a3-2a2ae2dbcce4','e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', '1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 56.00, 'NEFT');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('f47ed092-b871-11e9-a2a3-2a2ae2dbcce4','1679d922-b871-11e9-a2a3-2a2ae2dbcce4', '1dc09382-b872-11e9-a2a3-2a2ae2dbcce4', 465.00, 'IMPS');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('f8fd35dc-b871-11e9-a2a3-2a2ae2dbcce4','e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', '1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 654.00, 'OTHER_ELECTRONIC');

INSERT INTO Transactions(Id, DebitAccountId, CreditAccountId, Amount, TransactionType)
VALUES ('fcd2d4b4-b871-11e9-a2a3-2a2ae2dbcce4','1679d922-b871-11e9-a2a3-2a2ae2dbcce4', 'e9a41034-b870-11e9-a2a3-2a2ae2dbcce4', 4554.00, 'OTHER_ELECTRONIC');

