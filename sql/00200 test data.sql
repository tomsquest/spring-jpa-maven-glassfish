delete from Payment;

insert into Payment(id, label, value) values (1, 'toto', 10);
insert into Payment(id, label, value) values (2, 'titi', 20);
insert into Payment(id, label, value) values (3, 'tutu', 30);
insert into Payment(id, label, value) values (4, 'tata', 40);

select * from Payment



delete from Tag;

insert into Tag(id,label) values (1,'tagA');
insert into Tag(id,label) values (2,'tagB');

select * from Tag



delete from Payment_Tag;

insert into Payment_Tag values (1, 1);
insert into Payment_Tag values (1, 2);
insert into Payment_Tag values (2, 1);
insert into Payment_Tag values (2, 2);

select * from Payment_Tag;

