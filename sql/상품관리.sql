desc product; /*product ��ü ���� ����*/
desc sale; /*sale ��ü ���� ����*/
drop table product;  /*product table ����, �ڽ� ���� �� �θ� ����*/
drop table sale; /*sale table ����, �ڽ� ����*/
drop sequence seq_sale; /*seq_sale ���� */
drop view view_sale; /*view ����*/
select * from product;
select * from sale;

create table product ( /*Table PRODUCT��(��) �����Ǿ����ϴ�.*/
    code char(3) not null primary key, /*��ǰ �ڵ�� 3�ڸ�, null�� ����X ,�ߺ�X*/
    name varchar(200) not null, /*�̸� ���� ���� 200�ڸ�, null�� ����X*/
    price int default 0 /*��ǰ���� �Է¾��ϸ� 0 ���*/
);

create table sale ( /*Table SALE��(��) �����Ǿ����ϴ�.*/
    seq int primary key,
    code char(3) not null,
    sale_date date default sysdate, /*��¥ �Է� ���ϸ� ���� ��¥ ���*/
    qnt int default 1, /*��ǰ������ �Է¾��ϸ� 1 ���*/
    price int default 0, /*��ǰ���ݿ� �Է¾��ϸ� 0���*/
    foreign key (code) references product (code) /*product code�� ����*/
);

insert into product (code, name, price)
values ('101', '�����', 3500000);
insert into product (code, name, price)
values ('102', '��Ź��', 2300000);
insert into product (code, name, price)
values ('103', '��Ÿ�Ϸ�', 1700000);
insert into product (code, name, price)
values ('104', '���ڷ�����', 1200000);

create sequence seq_sale increment by 1 start with 1;
drop sequence seq_sale;
insert into sale(seq, code)
values(seq_sale.nextval, '101');
select * from sale;
delete from sale where seq > 0;
delete from product where code = '104';
update sale set qnt = 12 where seq = 1;

create view view_sale as
/*select s.*, name, price s.code�� ����, name, price �� ���ڴ� */
select s.*, p.name
from product p, sale s
where p.code = s.code; /* p.code�� s.code �� �������� ���ڴ�*/ 

select code, sum (price), sum (qnt)
from view_sale
group by code, sale_date;

select * from view_sale;
insert into sale (seq, code, sale_date)
values (seq_sale.nextval, '101', '24-04-18');

select * from view_sale order by sale_date, code;

select sale_date, code, sum(qnt) as qnt, price, name
from view_sale
group by sale_date, code, price, name
order by sale_date, code;


select * from sale where code = '103';

select sale_date, sum(qnt) qnt, sum(qnt) * price total
from view_sale
where code = '102'
group by sale_date, price; /*sale_date�� �׷��� �����*/

commit;

select * from view_sale;
insert into sale(seq, code, sale_date, qnt, price)
values(seq_sale.nextval, '101', '24-04-01', 3, 3200000);
insert into sale(seq, code, sale_date, qnt, price)
values(seq_sale.nextval, '101', '24-04-02', 1, 3200000);
insert into sale(seq, code, sale_date, qnt, price)
values(seq_sale.nextval, '101', '24-04-02', 1, 3200000);
insert into sale(seq, code, sale_date, qnt, price)
values(seq_sale.nextval, '102', '24-04-03', 1, 2150000);

select sale_date, code, name, sum(qnt), sum(price*qnt) 
from view_sale
group by sale_date, code, name
order by sale_date, code;

select * from view_sale;