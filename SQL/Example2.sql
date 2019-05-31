create database food;

use food;

create table dishes ( 
	id int auto_increment not null primary key,
    name varchar(500) not null,
    calories int,
    tastesGood boolean
);

insert into dishes (name, calories, tastesGood)
values ("eggs benedict", 1200, true),
	   ("eggs florentine", 999, true),
       ("rotten eggs", -300, false),
       ("egg white omelette", 200, true);
       
	select * from dishes;