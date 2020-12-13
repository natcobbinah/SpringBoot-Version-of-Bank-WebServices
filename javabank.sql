########################################
#Author: Nathaniel Cobbinah
#Bank Database and related queries
########################################

########################################
#Create database Bank
########################################
create database javaBank;

########################################
#Make database active 
########################################
use javaBank;

########################################
#Create table Client
########################################
create table Client(
ClientID  int primary key auto_increment,
firstname varchar(100) not null,
lastname varchar(100) not null,
email varchar(100) not null,
contact varchar(100) not null
) engine = InnoDB;

########################################
#Create table BankAccount
########################################
create table BankAccount(
accountStatus enum('ACTIVE','CLOSED') not null,
createdAt date not null,
balance  decimal(16,2) not null,
ClientID int,
accountNumber int primary key 
)engine = InnoDB;


########################################
#Create table BankOperations
########################################
create table Operations(
operationid int primary key auto_increment,
operationType enum('DEPOSIT','WITHDRAW','TRANSFER','CLOSE_ACCOUNT'),
operationAmount  decimal(16,2) not null,
doneAt date not null,
accountNumber varchar(16) 
)engine = InnoDB;


