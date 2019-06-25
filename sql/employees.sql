
-- display all employee by assending order
select *
from emp
order by ename asc;

-- display all employees who are in deparntment 10 

select * 
from emp 
where deptno = 10  

-- display all employees who are in deparntment 10 and 20

select  * 
from emp 
where deptno = 10 OR deptno =30  

-- display all employees whos commission is null

select *
from emp 
where isnull(comm);

-- display all employee whose salary is between 2000-5000

select *
from emp
where sal  between 2000 and 5000;

-- display employee name , salary , commission and anual CTC

select * ,(sal + ifNull(comm,0))*12 as CTC from emp

-- display all employees who are clerk
select * 
from emp 
where job ="clerk";

-- display name hiring date and experiance 

select*,date_format(from_days(datediff(current_date(),hiredate)),'%Y')+0 as experiance from emp;

-- display unique department no from employee table

select distinct deptno from emp; 
