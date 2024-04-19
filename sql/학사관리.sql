/* professors ���̺� ���� */
create table professors(
    pcode char(3) not null, /* 3�ڸ� ��ĭX */
    pname varchar(15) not null,  /* 15�ڸ� ��ĭX */
    dept varchar(30),  /* 30�ڸ� ��ĭX */
    hiredate date,
    title varchar(15),
    salary int default 0, /* �Է� ���Ҷ� 0 ��� */
    primary key(pcode) /* �⺻Ű */
);
desc professors;

/* students ���̺� ���� */
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

/* courses ���̺� ���� */
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

/* enrollments ���̺� ���� */
create table enrollments(
    lcode char(4) not null, 
    scode char(8) not null, 
    edate date, grade int default 0, 
    primary key(lcode, scode), 
    foreign key(lcode) references courses(lcode), 
    foreign key(scode) references students(scode)
);
desc enrollments;

/* ���̺� ���� */
drop table enrollments;
drop table students;
drop table courses;
drop table professors;

/* �������̺� ������ �Է� */
insert into professors(pcode,pname,dept,hiredate,title,salary) values('221','�̺���','����','75/04/03','������',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('228','���籤','����','91/09/19','�α���',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('311','������','����','94/06/09','�α���',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('509','����ȯ','����','92/10/14','������',2000000);
/* ���� ���̺��� ��� �����͸� �˻��Ͻÿ�. */
select * from professors;

/* �л����̺� ������ �Է� */
insert into students(scode,sname,dept,year,birthday,advisor) values('92414029','������','����',3,'73/10/06','228');
insert into students(scode,sname,dept,year,birthday,advisor) values('92414033','��â��','����',4,'73/10/26','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514009','������','����',4,'73/11/16','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514023','������','����',4,'73/08/29','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92454018','�̿���','����',3,'74/09/30','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95454003','���翵','����',4,'76/02/06','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95414058','������','����',4,'76/03/12','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('96414404','�����','����',3,'77/12/22','228');
/* �л� ���̺��� ��� �����͸� �˻��Ͻÿ�. */
select * from students;

/* �������̺� ������ �Է� */
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C301','����ó����', 3 ,'506','221',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C401','�����ͺ��̽�',3,'414','221',80,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C421','�˰���',3,'510','228',80,72);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C312','�ڷᱸ��',2,'510','228',100,60);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('E221','��ȸ��',3,'304','311',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('A109','�ѱ��ǰ��๮ȭ',2,'101','509',120,36);
/* ���� ���̺��� ��� �����͸� �˻��Ͻÿ�. */
select * from courses;

/* ������û ���̺� ������ �Է� */
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
/* ������û ���̺��� ��� �����͸� �˻��Ͻÿ�. */
select * from enrollments;

/* ������û ���̺��� ��� �����͸� ���� ����. */
select count(*) from enrollments;

/* ���� ���̺��� pname, dept, title�� �˻��Ͻÿ� */
select pname, dept, title from professors;

/* ���� ���̺��� dept�� �˻��Ͻÿ� (�ߺ� ���� = distinct(dept)) */ /*���� ���̺��� �������� �ٹ��ϴ� �Ҽ��а� �̸��� �˻��Ͻÿ� (��, �ߺ� ���� �����Ͻÿ�). */
select distinct(dept) from professors;

/*�л� ���̺��� '����'�̸鼭 '3'�г� �л����� �̸�, �й�, ��������� �˻��Ͻÿ�. */
select * from students;
select sname, scode, birthday, dept, year 
from students 
where dept = '����' and year = '3'; 

/*���� ���̺��� '1993�� 3�� 1��' ������ �ӿ�� �������� �̸�, �Ҽ��а��� �˻��Ͻÿ�. */
select pname, dept, hiredate 
from professors
where hiredate <= '1993/03/01';

/*�л� ���̺��� ������ȣ�� '221'�� ������ �������� �ʴ� �л����� �˻��Ͻÿ�. */
select *
from students
where advisor != '221';

/*������û ���̺��� ������ 80�� �̻��� �����ȣ, �л���ȣ�� �˻��Ͻÿ�. */
select lcode, scode, grade
from enrollments
where grade >= 80;

/* ���� ���̺��� �����̸��� '����'�̶�� �ܾ �����ϴ� ������ ���� ��ȣ, ���� �̸�, ��� ����, ���ǽð����� �˻��Ͻÿ� */
select lcode, lname, instructor, hours
from courses
where lname like '%����%';

/* ������û ���̺��� 1998�� 3�� 1�Ͽ��� 3�� 3�� ���̿� ������û �� ���¹�ȣ, �л���ȣ, ���� ��û���� �˻��Ͻÿ� (���̿� between)*/
select *
from enrollments
where edate between '1998/03/01' and '1998/03/03';

/* ������û ���̺��� 1998�� 3�� 1�Ͽ��� 3�� 3�� ���̿� ������û �� ���¹�ȣ, �л���ȣ, ���� ��û���� �˻��Ͻÿ� (���̿� between �� �Ⱦ� ���) */
select *
from enrollments
where edate >= '1998/03/01' and edate <= '1998/03/03';

/* ���� ���̺��� ������ '������' �̰ų� '�α���' �� �������� ������ȣ, ������, ������ �˻��Ͻÿ�. (�̰ų� or) */
select *
from professors
where title = '������' or title = '�α���';

/* ���� ���̺��� ������ '������' �̰ų� '�α���' �� �������� ������ȣ, ������, ������ �˻��Ͻÿ�. (�̰ų� or �� �Ⱦ� ��� in) */
select *
from professors
where title in ('������', '�α���');

/* '����'�� �л����� �й�, �̸�, ��������� �̸��� �������� ��������, ��������� �������� �������� ������ �Ͻÿ�. */
select *
from students
where dept = '����'
order by sname asc, birthday desc; /* asc �������� ���� ���� */ /* desc �������� ���� ���� */

/* '����'�� �л����� �й�, �̸�, ��������� �̸��� �������� ��������, ��������� �������� �������� ������ �Ͻÿ�. (where ����)*/
select *
from students
order by dept asc, sname desc; /* asc �������� ���� ���� */ /* desc �������� ���� ���� */

commit;

/* =============================����===========================*/
/*�л����� �а�, �л��̸�, ���������̸��� �˻��Ͻÿ�.*/
select s.dept, s.sname, p.pname, p.dept
from professors p, students s
where p.pcode = s.advisor;

/*���¹�ȣ, ���¸�, �����̸��� �˻��Ͻÿ�.*/
select c.lcode, c.lname, p.pname
from professors p, courses c
where p.pcode = c.instructor;

/*�й�, �л��̸�, �л����� ������û �� ���¹�ȣ, ������û���� �˻��Ͻÿ�*/
select s.scode, s.sname, e.lcode, e.edate
from students s, enrollments e
where e.scode = s.scode
order by e.lcode;

/*1. �й�, �л����� ������û �� ���¹�ȣ, ���¸�, ������ �˻��Ͻÿ�.*/
create view view1 as
select s.scode, s.sname, e.lcode, e.grade, c.lname
from students s, enrollments e, courses c
where e.scode = s.scode and e.lcode = c.lcode
order by e.scode;

select * from view1;

/*'�̺���'�� ������ �����ϴ� �л����� �̸�, �г�, ��������� �˻��Ͻÿ�*/
select p.pname, s.sname, s.year, s.birthday
from professors p, students s
where p.pname = '�̺���';

/*'98/03/03'�� ������û �� �л����� �й�, �л��̸�, ���¹�ȣ�� �˻��Ͻÿ�.*/
select e.edate, s.scode, s.sname, c.lcode
from enrollments e, students s, courses c
where e.edate = '98/03/03';

/*'����'�� �������� �����ϴ� �л����� �̸�, �г�, ��������� �˻��Ͻÿ�.*/
select s.sname, s.year, s.birthday, p.pname
from professors p, students s
where p.pcode = s.advisor
and p.dept = '����';

/*�ڷᱸ��'�� �����ϴ� ������ �а���, ���� ���� �˻��Ͻÿ�.*/
select c.lname, p.dept, p.pname
from courses c, professors p
where p.pcode = c.instructor
and c.lname = '�ڷᱸ��';

/*'����ó����'�� ������û �� �л����� �й�, ������û��, ������ �˻��Ͻÿ�.*/
select c.lname, e.scode, e.edate, e.grade 
from courses c, enrollments e
where c.lcode = e.lcode
and c.lname = '����ó����';

/*'�ڷᱸ��' ������ ������û �� �л����� �а�, �л��̸�, ������ �˻��Ͻÿ�.*/
select c.lname, s.dept, s.sname, e.grade
from courses c, enrollments e, students s
where e.scode = s.scode 
and c.lname = '�ڷᱸ��';


/*'����'�� �л����� �й�, �л��̸�, ������û �� ���¹�ȣ, ���� ��, ������ �˻��Ͻÿ�.*/

/*'����ó����'�� �����ϴ� ������ �̸�, �� ������ �����ϴ� �л����� �й�, �л����� �˻��Ͻÿ�.*/

/*'�����ͺ��̽�'�� �����ϴ� ������, �� ������ ������û �� �л����� �а�, �̸�, ������ �˻��Ͻÿ�.*/

/*������ 80�� �̻��� �л����� �й�, �л��̸�, ���¹�ȣ, ���¸�, ��米�� ���� �˻��Ͻÿ�.*/