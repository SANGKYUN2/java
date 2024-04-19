desc product; /*product 객체 존재 여부*/
desc sale; /*sale 객체 존재 여부*/
drop table product;  /*product table 삭제, 자식 삭제 후 부모 삭제*/
drop table sale; /*sale table 삭제, 자식 삭제*/
drop sequence seq_sale; /*seq_sale 삭제 */
drop view view_sale; /*view 삭제*/
select * from product;
select * from sale;

create table product ( /*Table PRODUCT이(가) 생성되었습니다.*/
    code char(3) not null primary key, /*상품 코드는 3자리, null값 저장X ,중복X*/
    name varchar(200) not null, /*이름 길이 지정 200자리, null값 저장X*/
    price int default 0 /*상품값에 입력안하면 0 출력*/
);

create table sale ( /*Table SALE이(가) 생성되었습니다.*/
    seq int primary key,
    code char(3) not null,
    sale_date date default sysdate, /*날짜 입력 안하면 오늘 날짜 출력*/
    qnt int default 1, /*상품수량에 입력안하면 1 출력*/
    price int default 0, /*상품가격에 입력안하면 0출력*/
    foreign key (code) references product (code) /*product code를 참조*/
);

insert into product (code, name, price)
values ('101', '냉장고', 3500000);
insert into product (code, name, price)
values ('102', '세탁기', 2300000);
insert into product (code, name, price)
values ('103', '스타일러', 1700000);
insert into product (code, name, price)
values ('104', '전자레인지', 1200000);

create sequence seq_sale increment by 1 start with 1;
drop sequence seq_sale;
insert into sale(seq, code)
values(seq_sale.nextval, '101');
select * from sale;
delete from sale where seq > 0;
delete from product where code = '104';
update sale set qnt = 12 where seq = 1;

create view view_sale as
/*select s.*, name, price s.code의 모든것, name, price 를 보겠다 */
select s.*, p.name
from product p, sale s
where p.code = s.code; /* p.code와 s.code 가 같은것을 보겠다*/ 

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
group by sale_date, price; /*sale_date로 그룹을 지어라*/

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