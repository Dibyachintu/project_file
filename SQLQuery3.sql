Create table Customer(
ID int Not null,
Name nvarchar(50),
Email nvarchar(50),
Payment nvarchar(50),
Primary key (ID),
);

Create Table Ordar(
ID int NOT NULL,
orderDescription nvarchar(50),
OrderDate nvarchar(50),
Price int ,
primary key (ID),
Customer_ID int references Customer(ID),
);

insert into Customer values(1,'dibya','dibyajyotichintu99@gmail.com','cash')
insert into ordar values(1,'kg k3',22/06/2022,2000,1)

select * from Customer;
select * from Ordar;

