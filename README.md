# Money Transfer
> RESTful API (including data model and the backing implementation) for
money transfers between accounts.

### Data Models
##### Accounts
| Id | CurrentBalance | AccountStatus | CreatedAt |
| ------ | ------ | -------| ------ |
| 1dc09382-b872-11e9-a2a3-2a2ae2dbcce4 | 2373271.00 | ACTIVE | 1565134179.297000000 |

##### Transactions
| Id | DebitAccountId | CreditAccountId | Amount | TransactionType | CreatedAt |
| ------ | ------ | -------| ------ | ------ | ------ |
| cc3ac924-b871-11e9-a2a3-2a2ae2dbcce4 | 1dc09382-b872-11e9-a2a3-2a2ae2dbcce4 | 65e65a27-89cf-473d-8e31-526264db78e3 | 231.00 | NEFT | 1565134179.297000000 |


### API
| Resource | Method | Description |
| ----- | ----- | ------ |
| **Accounts** |   |   |
| /accounts/{accountUUID} | GET | returns information of account by accountId |
| /accounts/ | POST | creates account |
| /accounts/{accountUUID}/deactivate | PUT | deactivate account by accountId |
| /accounts/{accountUUID}/approve | PUT | change account state to ACTIVE |
|   |   |   |
| **Transactions** |   |   |
| /transactions/{transactionUUID} | GET | returns information of transaction by transactionId |
| /transactions/transact | POST | transfers amount between account |

### Tech
  - Uses in memory H2 database
  - Orchestration is handled using RxJava
  - Jersey asynchronous response processing
  - Flyway for db migration
  - Uses Maven as build tool
  - All objects created are Immutable
 
### How to run
```ruby
$ mvn clean compile install
$ mvn compile exec:java
$ ##app is running on port 9001
```

### Sample curl
```sh
$ ##get account by id
$ curl -X GET http://localhost:9001/accounts/781a4bdc-93ba-4e37-9376-ecdc315ea352 
```
```sh
$ ##create account
$ curl -X POST \
  http://localhost:9001/accounts \
  -H 'Accept: */*' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 33' \
  -H 'Content-Type: application/json' \
  -d '{
    "currentBalance": 3422.00
}'
```
```sh
$ ##transact
$ curl -X POST \
  http://localhost:9001/transactions/transact \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 177' \
  -H 'Content-Type: application/json' \
  -d '{
    "debitAccountId": "65e65a27-89cf-473d-8e31-526264db78e3",
    "creditAccountId": "1679d922-b871-11e9-a2a3-2a2ae2dbcce4",
    "amount": 221,
    "transactionType": "NEFT"
}'
```
