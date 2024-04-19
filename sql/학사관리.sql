/* professors 테이블 생성 */
create table professors(
    pcode char(3) not null, /* 3자리 빈칸X */
    pname varchar(15) not null,  /* 15자리 빈칸X */
    dept varchar(30),  /* 30자리 빈칸X */
    hiredate date,
    title varchar(15),
    salary int default 0, /* 입력 안할때 0 출력 */
    primary key(pcode) /* 기본키 */
);
desc professors;

/* students 테이블 생성 */
create table students(
     scode char(8) not null, 
     sname varchar(15) not null, 
     dept varchar(30), 
     year int default 1, 
     birthday date, 
     advisor char(3), 
     primary key(scode), 
     foreign key(advisor) references professors(pcode)
);
desc students;

/* courses 테이블 생성 */
create table courses(
    lcode char(4) not null, 
    lname varchar(50) not null, 
    hours int, room char(3), 
    instructor char(3), 
    capacity int default 0, 
    persons int default 0, 
    primary key(lcode),
    foreign key(instructor) references professors(pcode)
);
desc courses;

/* enrollments 테이블 생성 */
create table enrollments(
    lcode char(4) not null, 
    scode char(8) not null, 
    edate date, grade int default 0, 
    primary key(lcode, scode), 
    foreign key(lcode) references courses(lcode), 
    foreign key(scode) references students(scode)
);
desc enrollments;

/* 테이블 삭제 */
drop table enrollments;
drop table students;
drop table courses;
drop table professors;

/* 교수테이블 데이터 입력 */
insert into professors(pcode,pname,dept,hiredate,title,salary) values('221','이병렬','전산','75/04/03','정교수',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('228','이재광','전산','91/09/19','부교수',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('311','강승일','전자','94/06/09','부교수',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('509','오문환','건축','92/10/14','조교수',2000000);
/* 교수 테이블의 모든 데이터를 검색하시오. */
select * from professors;

/* 학생테이블 데이터 입력 */
insert into students(scode,sname,dept,year,birthday,advisor) values('92414029','서연우','전산',3,'73/10/06','228');
insert into students(scode,sname,dept,year,birthday,advisor) values('92414033','김창덕','전산',4,'73/10/26','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514009','이지행','전자',4,'73/11/16','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514023','김형명','전자',4,'73/08/29','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92454018','이원구','건축',3,'74/09/30','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95454003','이재영','건축',4,'76/02/06','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95414058','박혜경','전산',4,'76/03/12','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('96414404','김수정','전산',3,'77/12/22','228');
/* 학생 테이블의 모든 데이터를 검색하시오. */
select * from students;

/* 강좌테이블 데이터 입력 */
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C301','파일처리론', 3 ,'506','221',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C401','데이터베이스',3,'414','221',80,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C421','알고리즘',3,'510','228',80,72);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C312','자료구조',2,'510','228',100,60);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('E221','논리회로',3,'304','311',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('A109','한국의건축문화',2,'101','509',120,36);
/* 강좌 테이블의 모든 데이터를 검색하시오. */
select * from courses;

/* 수강신청 테이블 데이터 입력 */
insert into enrollments(lcode, scode, edate, grade) values('C401','92414033','98/03/02',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414033','98/03/02',80);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414033','98/03/02', 0);
insert into enrollments(lcode, scode, edate, grade) values('C401','95414058','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C312','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C421','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414029','98/03/03',0);
insert into enrollments(lcode, scode, edate, grade) values('C312','92414029','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('E221','92414029','98/03/03',75);
insert into enrollments(lcode, scode, edate, grade) values('A109','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514009','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('E221','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C401','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C421','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C312','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('E221','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('A109','95454003','98/03/05',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','95454003','98/03/05',83);
insert into enrollments(lcode, scode, edate, grade) values('E221','95454003','98/03/05',75);
/* 수강신청 테이블의 모든 데이터를 검색하시오. */
select * from enrollments;

/* 수강신청 테이블의 모든 데이터를 갯수 세기. */
select count(*) from enrollments;

/* 교수 테이블의 pname, dept, title를 검색하시오 */
select pname, dept, title from professors;

/* 교수 테이블의 dept를 검색하시오 (중복 제거 = distinct(dept)) */ /*교수 테이블에서 교수들이 근무하는 소속학과 이름을 검색하시오 (단, 중복 값은 제거하시오). */
select distinct(dept) from professors;

/*학생 테이블에서 '전산'이면서 '3'학년 학생들의 이름, 학번, 생년월일을 검색하시오. */
select * from students;
select sname, scode, birthday, dept, year 
from students 
where dept = '전산' and year = '3'; 

/*교수 테이블에서 '1993년 3월 1일' 이전에 임용된 교수들의 이름, 소속학과를 검색하시오. */
select pname, dept, hiredate 
from professors
where hiredate <= '1993/03/01';

/*학생 테이블에서 교수번호가 '221'인 교수가 지도하지 않는 학생들을 검색하시오. */
select *
from students
where advisor != '221';

/*수강신청 테이블에서 성적이 80점 이상인 과목번호, 학생번호를 검색하시오. */
select lcode, scode, grade
from enrollments
where grade >= 80;

/* 강좌 테이블에서 강좌이름이 '건축'이라는 단어를 포함하는 강좌의 강좌 번호, 강좌 이름, 담당 교수, 강의시간수를 검색하시오 */
select lcode, lname, instructor, hours
from courses
where lname like '%건축%';

/* 수강신청 테이블에서 1998년 3월 1일에서 3월 3일 사이에 수강신청 한 강좌번호, 학생번호, 수강 신청일을 검색하시오 (사이에 between)*/
select *
from enrollments
where edate between '1998/03/01' and '1998/03/03';

/* 수강신청 테이블에서 1998년 3월 1일에서 3월 3일 사이에 수강신청 한 강좌번호, 학생번호, 수강 신청일을 검색하시오 (사이에 between 를 안쓸 경우) */
select *
from enrollments
where edate >= '1998/03/01' and edate <= '1998/03/03';

/* 교수 테이블에서 직급이 '정교수' 이거나 '부교수' 인 교수들의 교수번호, 교수명, 직급을 검색하시오. (이거나 or) */
select *
from professors
where title = '정교수' or title = '부교수';

/* 교수 테이블에서 직급이 '정교수' 이거나 '부교수' 인 교수들의 교수번호, 교수명, 직급을 검색하시오. (이거나 or 를 안쓸 경우 in) */
select *
from professors
where title in ('정교수', '부교수');

/* '전산'과 학생들의 학번, 이름, 생년월일을 이름을 기준으로 오름차순, 생년월일을 기준으로 내림차순 정렬을 하시오. */
select *
from students
where dept = '전산'
order by sname asc, birthday desc; /* asc 오름차순 생략 가능 */ /* desc 오름차순 생략 가능 */

/* '전산'과 학생들의 학번, 이름, 생년월일을 이름을 기준으로 오름차순, 생년월일을 기준으로 내림차순 정렬을 하시오. (where 생략)*/
select *
from students
order by dept asc, sname desc; /* asc 오름차순 생략 가능 */ /* desc 오름차순 생략 가능 */

commit;

/* =============================문제===========================*/
/*학생들의 학과, 학생이름, 지도교수이름을 검색하시오.*/
select s.dept, s.sname, p.pname, p.dept
from professors p, students s
where p.pcode = s.advisor;

/*강좌번호, 강좌명, 교수이름을 검색하시오.*/
select c.lcode, c.lname, p.pname
from professors p, courses c
where p.pcode = c.instructor;

/*학번, 학생이름, 학생들이 수강신청 한 강좌번호, 수강신청일을 검색하시오*/
select s.scode, s.sname, e.lcode, e.edate
from students s, enrollments e
where e.scode = s.scode
order by e.lcode;

/*1. 학번, 학생들이 수강신청 한 강좌번호, 강좌명, 성적을 검색하시오.*/
create view view1 as
select s.scode, s.sname, e.lcode, e.grade, c.lname
from students s, enrollments e, courses c
where e.scode = s.scode and e.lcode = c.lcode
order by e.scode;

select * from view1;

/*'이병렬'과 교수가 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오*/
select p.pname, s.sname, s.year, s.birthday
from professors p, students s
where p.pname = '이병렬';

/*'98/03/03'에 수강신청 한 학생들의 학번, 학생이름, 강좌번호를 검색하시오.*/
select e.edate, s.scode, s.sname, c.lcode
from enrollments e, students s, courses c
where e.edate = '98/03/03';

/*'전산'과 교수들이 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오.*/
select s.sname, s.year, s.birthday, p.pname
from professors p, students s
where p.pcode = s.advisor
and p.dept = '전산';

/*자료구조'를 강의하는 교수의 학과명, 교수 명을 검색하시오.*/
select c.lname, p.dept, p.pname
from courses c, professors p
where p.pcode = c.instructor
and c.lname = '자료구조';

/*'파일처리론'을 수강신청 한 학생들의 학번, 수강신청일, 점수를 검색하시오.*/
select c.lname, e.scode, e.edate, e.grade 
from courses c, enrollments e
where c.lcode = e.lcode
and c.lname = '파일처리론';

/*'자료구조' 과목을 수강신청 한 학생들의 학과, 학생이름, 성적을 검색하시오.*/
select c.lname, s.dept, s.sname, e.grade
from courses c, enrollments e, students s
where e.scode = s.scode 
and c.lname = '자료구조';


/*'전자'과 학생들의 학번, 학생이름, 수강신청 한 강좌번호, 강좌 명, 성적을 검색하시오.*/

/*'파일처리론'을 강의하는 교수의 이름, 이 교수가 지도하는 학생들의 학번, 학생명을 검색하시오.*/

/*'데이터베이스'를 강의하는 교수명, 이 과목을 수강신청 한 학생들의 학과, 이름, 성적을 검색하시오.*/

/*성적이 80점 이상인 학생들의 학번, 학생이름, 강좌번호, 강좌명, 담당교수 명을 검색하시오.*/