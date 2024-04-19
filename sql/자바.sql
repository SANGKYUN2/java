create table professors(
    pcode char(3) primary key, /*3자리만 입력받음*/
    pname varchar(15),
    dept varchar(30),
    hiredate date,
    title varchar(15),
    salary int
);

/* drop table professors; */ 


insert into professors(pcode,pname,dept,hiredate,title,salary)
values('221', '이병렬', '전산', '75/04/03', '정교수', 3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('228', '이재광', '전산', '91/09/19', '부교수' , 2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('311', '강승일', '전자', '94/06/09', '부교수', 2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary)
values('509', '오문환', '건축', '92/10/14', '조교수', 2000000);

/* 교수 테이블의 모든 데이터를 출력 */
select * from professors;

/* 교수 테이블의 모든 데이터를 삭제 */
delete from professors where pcode is not null;

/* 221번 교수의 이름을 김병렬로 수정 */
update professors set pname = '이병렬', dept = '전산'
where pcode = '221'; 

select * from professors;
select * from professors where dept = '전산';

/* 부분일치 검색 */
select * from professors where pname like '이%';

/* 이가 들어가는 이름 출력 */
select * from professors where pname like '%이%';

/* 올림차순 작은값 -> 큰값, 기본적으로는 어센딩을 씀, 어센딩asec, 내림차순 큰값 -> 작은값 디센딩desc */
select * from professors order by pname;
select * from professors order by salary desc;



commit;

select max(pcode)+1 as code from professors;

select * from professors where pcode = '228';

select * from professors;

delete from professors where pcode = '33';

update professors set hiredate = sysdate, title = '과일', salary = 900000
where pcode = '225';

commit;
