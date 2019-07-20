SELECT * FROM swabhav.EMP;

select deptno,
count(deptno) 
from emp 
group by(deptno)

-- jobwise employees
select  job ,
count(job) 
from emp 
group by(job)

-- departmentwise jobwise employess

select count(job), job,deptno 
from emp 
group by job,deptno 
order by deptno ;

--  
select count(job), job,deptno 
from emp 
group by job,deptno  
having count(job)>=2
order by deptno;

--  
select count(job) as a,job,deptno
from emp
where deptno = 10 OR deptno =20
group by job , deptno
having a >=2
order by deptno;

-- 

select lower(ename) ,lower(dname)
from emp
inner join dept on emp.deptno = dept.deptno ;


select * from swabhav.DEPT;

-- display department where no employees

select lower(ename),lower(dname)
from dept
left join emp on emp.deptno = dept.deptno 
where ename is null;

-- employee name and their managerID  

select e1.ename ,e2.ename as manager
from emp e1
left join  emp e2 on e1.mgr = e2.empno;

-- employee name and their managerID and department no

select e1.ename ,e2.ename as manager,dname
from emp e1
left join  emp e2 on e1.mgr = e2.empno
left join DEPT on e1.deptno = dept.deptno;
















