create database test;

use test;

create table bottle (
id int auto_increment not null primary key,
name varchar(500),
want varchar(100)
);

insert into bottle(name)
values ("Water"),
		("wine"),
        ("whisky");

ALTER TABLE bottle ADD want VARCHAR(100);
        
INSERT INTO bottle (id, want) VALUES (1, "meh"), (2, "sure"), (3, "definitely") ON DUPLICATE KEY UPDATE want = VALUES(want);
SELECT * FROM bottle;
select * from bottle;