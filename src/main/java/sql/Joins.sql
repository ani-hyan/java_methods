--1.Finds the salesperson and customer who reside in the same city. 
--Returns Salesman, cust_name and city

select salesman_name, cust_name, s.city
from customer
inner join salesman s on customer.city = s.city;

--2.find those orders where the order amount exists between 500 and 2000.
--Returns ord_no, purch_amt, cust_name, city

select ord_no, purch_amt, cust_name, city
from orders o, customer c
where o.customer_id = c.customer_id and o.purch_amt between 500 and 2000;

--3. Finds the salesperson(s) and the customer(s) he represents. 
--Returns Customer Name, city, Salesman, commission.
select cust_name, customer.city, salesman_name, commission
from customer
left join salesman s on customer.salesman_id = s.salesman_id;

--4. Finds salespeople who received commissions of more than 12 percent from the company. 
--Returns Customer Name, customer city, Salesman, commission. 
select cust_name, customer.city, salesman_name, commission
from customer 
left join salesman s on customer.salesman_id = s.salesman_id
where commission > 0.12;


--5. Locates those salespeople who do not live in the same city where their customers live 
--and have received a commission of more than 12% from the company.
select cust_name, customer.city, s.city, salesman_name, commission
from customer 
inner join salesman s on customer.salesman_id = s.salesman_id
where commission > 0.12 and s.city != customer.city;

--6. Finds the details of an order
select ord_no, ord_date, purch_amt, cust_name, grade, salesman_name, commission
from orders o
inner join customer c on o.customer_id = c.customer_id
inner join salesman s on o.salesman_id = s.salesman_id;

--7. Joins the tables salesman, customer and orders so that the same column of each table appears 
--once and only the relational rows are returned.
SELECT * 
FROM orders 
NATURAL JOIN customer  
NATURAL JOIN salesman;

--8. Displays the customer name, customer city, grade, salesman, salesman city
select cust_name, c.city, grade, 
salesman_name, s.city
from customer c
inner join salesman s on c.salesman_id = s.salesman_id
order by customer_id asc;


--9. Finds those customers with a grade less than 300.
--The result should be ordered by ascending customer_id.
select cust_name, c.city, grade, 
salesman_name, s.city
from customer c
inner join salesman s on c.salesman_id = s.salesman_id
where grade < 300
order by customer_id asc;

--10. Makes a report with customer name, city, order number, order date, 
--and order amount in ascending order according to the order date to determine 
--whether any of the existing customers have placed an order or not.
select cust_name, c.city, ord_no, ord_date, purch_amt
from orders o
right join customer c on c.customer_id = o.customer_id
order by ord_date asc;

--11. Generates a report with customer name, city, order number, order date, order amount, 
--salesperson name, and commission to determine if any of the existing customers have not placed orders 
--or if they have placed orders through their salesman or by themselves
select cust_name, c.city, ord_no, ord_date, purch_amt,
salesman_name, commission
from customer c  
left join orders o on c.customer_id = o.customer_id 
left join salesman s on s.salesman_id = o.salesman_id;


--12. Generates a list in ascending order of salespersons who work either 
--for one or more customers or have not yet joined any of the customers
select s.salesman_id, salesman_name, customer_id
cust_name
from salesman s
left join customer c on s.salesman_id = c.salesman_id
order by salesman_id;


--13. Lists all salespersons along with customer name, city, grade, order 
--number, date, and amount
select cust_name, c.city, grade, salesman_name,
ord_no, ord_date, purch_amt
from salesman s
left join customer c on s.salesman_id = c.salesman_id
right join orders o on s.customer_id = o.customer_id;


--14. Makes a list for the salesmen who either work for one or more 
--customers or yet to join any of the customer.
select s.salesman_id, salesman_name, c.customer_id,
c.cust_name, purch_amt
from salesman s
left join customer c on s.salesman_id =
c.salesman_id
left join orders o on s.salesman_id =
o.salesman_id
where purch_amt > 2000 and grade is not null; 


--15. Lists who put one or more orders, or which orders have been placed
--by the customer who is not on the list
select cust_name, c.city, ord_no, ord_date,
purch_amt
from customer c
left join orders o on c.customer_id = o.customer_id;


--16. Generates a report with the customer name, city, order no. order date, 
--purchase amount for only those customers on the list who must have a grade 
--and placed one or more orders or which order(s) have been placed by the 
--customer who neither is on the list nor has a grade
select cust_name, c.city, ord_no, ord_date,
purch_amt
from customer c
full join orders o on c.customer_id = 
o.customer_id
where grade is not null; 


--17. Combines each row of the salesman table with each row of the customer table
select *
from salesman s
cross join customer c;

--18. Creates a Cartesian product between salesperson and customer
select salesman.salesman_id, salesman_name, customer_id,
cust_name
from customer
cross join salesman
where salesman.city is not null;


--19. Creates a Cartesian product between salesperson and customer, 
--i.e. each salesperson will appear for every customer and vice versa 
--for those salesmen who belong to a city and customers who require a grade
select salesman.salesman_id, salesman_name, customer_id,
cust_name
from customer
cross join salesman
where salesman.city is not null and grade is not null;

--20. Makes a Cartesian product between salesman and customer 
--i.e. each salesman will appear for all customers and vice versa
select *
from customer
cross join salesman
where salesman.city is not null and 
customer.city != salesman.city and
grade is not null;

--21. Selects all rows from both participating tables as long as there 
--is a match between pro_com and com_id.
select *
from item_mast
inner_join company_mast on pro_com = com_id;


--23. Calculates the average price of items of each company.
selcet avg(pro_price), company_mast.com_name
from item_mast INNER 
join company_mast
on item_mast.pro_com= company_mast.com_id
group by company_mast.com_name;


--29. Finds the names of departments where more than two employees 
--are employed. Return dpt_name
slect emp_department.dpt_name
from emp_details 
inner join emp_department
on emp_dept =dpt_code
group by emp_department.dpt_name
having count(*) > 2;
