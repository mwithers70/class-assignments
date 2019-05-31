CREATE DATABASE prints;

USE prints;

CREATE TABLE customers (
	customer_id int primary key,
    customer_name varchar (200),
    customer_add varchar (200),
    customer_city varchar (200),
    customer_state varchar (200),
    customer_zip int,
    customer_phone varchar (20)
);

INSERT INTO customers (customer_id, customer_name, customer_add, customer_city, customer_state, customer_zip, customer_phone)
  VALUES (1000, "Cora Blanca", "1555 Seminole Ct", "Charlotte", "NC", 28210, "704/552/1810"),
   (1100, "Yash Reed", "878 Madison Ave", "Greensboro", "NC", 27407, "336/316/5434"),
   (1200, "John Mills", "4200 Olive Ave", "Columbia", "SC", 29206, "803/432/6225"),
   (1300, "David Cox", "608 Old Post Rd", "Decatur", "GA", 30030, "404/243/7379"),
   (1400, "Tina Evans", "235 Easton Ave"," Jacksonville", "FL", 32221, "904/992/7234"),
   (1500, "Will Allen", "2508 W Shaw Rd", "Raleigh", "NC", 27542, "919/809/2545"),
   (1600, "James Boyd", "200 Pembury Ln", "Columbia", "SC", 29206, "803/432/7600"),
   (1700, "Will Parsons"," 4990 S Pine St", "Raleigh", "NC", 27545, "919/355/0034"),
   (1800, "Walter Kelly", "1200 Little St", "Columbia", "SC", 29206, "803/432/1987"),
   (1900, "Ann Damian", "7822 N Ridge Rd", "Jacksonville", "FL", 32216, "904/725/4672"),
   (2000, "Grace Hull", "4090 Caldweld St", "Charlotte", "NC", 28205, "704/365/7655"),
   (2100, "Jane Brown", "3320 W Main St", "Charlotte", "NC", 28210, "704/372/9000"),
   (2200, "Betty Draper"," 1600 Sardis Rd", "Sarasota", "FL", 32441, "918/941/9121");

create table items (
	item_id int primary key,
    Title varchar (200),
    artist varchar (200),
    unit_price varchar (200),
    on_hand varchar (200)
);

insert into items (item_id, Title, artist, unit_price, on_hand)
values (100, "Under the Sun", "Donald Arley", 46.80, 340),
	(200, "Dark Lady", "Keith Morris", 120.99, 250),
	(300, "Happy Days", "Andrea Reid", 78.00, 210),
	(350, "Top of the Mountain", "Janince Jones", 110.00, 290),
	(400, "Streets from Old", "Sharon Brune", 123.00, 320),
	(450, "The HuntWalter", "Alford", 39.99, 390),
	(600, "Rainbow Row", "Judy Ford", 46.00, 350),
	(700, "Skies Above", "Alexander Wilson", 98.00, 275), 
	(800, "The Seas and Moon", "Susan Beeler", 67.81 , 235), 
	(850, "Greek Isles", "Benjamin Caudle", 76.00, 300);

create table orders (
	order_id int primary key,
    customer_id int,
    order_date varchar (200),
    ship_date varchar (200)
);

insert into orders (order_id, customer_id, order_date, ship_date)
values (1, 1200, 2013-10-23, 2013-10-28),
	(2, 1500, 2013-10-30, 2013-11-03),
    (3, 1500, 2013-11-09, 2013-11-14),
	(4, 2100, 2013-11-15, 2013-11-20),
	(5, 1600, 2013-11-15, 2013-11-20),
	(6, 1900, 2013-12-15, 2013-12-19),
	(7, 2200, 2013-12-18, 2013-12-22),
	(8, 1600, 2013-12-20, 2013-12-22),
	(9, 1000, 2013-01-18, 2014-01-23),
	(10, 2200, 2014-01-31, 2014-02-04),
	(11, 1500, 2014-02-01, 2014-02-06),
	(12, 1400, 2013-02-27, 2014-03-02),
	(13, 1100, 2014-03-10, 2014-03-15),
	(14, 1400, 2014-03-14, 2014-03-19);

create table orderline (
	order_id int primary key,
    item_id int,
    order_qty int
);

insert into orderline (order_id, item_id, order_qty)
values (1, 800, 2),
	(1, 600, 1),
    (2, 700, 3),
	(2, 300, 2),
	(3, 850, 1),
	(4, 200, 4),
	(4, 100, 1),
	(4, 850, 1),
	(5, 450, 1),
	(6, 800, 2),
	(7, 300, 2),
	(7, 600, 2),
	(8, 100, 1),
	(9, 100, 3),
	(10, 450, 6),
	(10, 600, 8),
	(10, 200, 4),
	(11, 700, 2),
	(12, 300, 3),
	(12, 700, 4),
	(13, 200, 2),
	(13, 600, 10),
	(13, 450, 4),
	(14, 700, 8),
	(14, 200, 6),
	(14, 800, 4),
	(14, 450, 2);
    

select * from customers;
select * from items;
select * from orders;
select * from orderline;