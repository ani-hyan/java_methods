create database company;

create table employee (
	id INT PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	gender VARCHAR(50) NOT NULL,
	position VARCHAR(50) NOT NULL,
	department VARCHAR(50) NOT NULL,
	age INT NOT NULL,
	start_date DATE NOT NULL,
	salary VARCHAR(50) NOT NULL
);

create table project (
	id INT primary key,
	department VARCHAR(50) not null,
	start_date DATE not null,
	end_date DATE not null
);

1.
select * from employee;

2.
select distinct department from employee;

3.
select * from employee
where position='Editor';

4.
select * from employee
where gender='Female' and (department='Marketing' or position='Operator');

5. 
select * from employee
where department='Sales'
order by salary desc;

6.
select * from employee
where position='Sales Representative' or position='Accountant';

7.
select * from employee
where age between 30 and 40;

8.
select department, max(salary) from employee
group by department;

9. 
select avg(regexp_replace(salary::text, '[$,]', '', 'g')::numeric) from employee
where extract(year from start_date) > 2018;

10.
select * from project
where start_date >= '1/1/2019'
and end_date <= '12/31/2022';

11.
select * from project 
where start_date  between '1/1/2020'
and '12/31/2020';