
-- select max(salary) as SecondHighestSalary from Employee where salary<(select max(salary) from Employee);
-- select max(distinct(salary)) as SecondHighestSalary from Employee e where 1=(select count(Distinct(salary)) from Employee p where p.salary>e.salary); 


-- select (select distinct(salary) from Employee order by Salary Desc limit 1 offset 1) as SecondHighestSalary;

select ifnull(((select distinct(salary) from Employee order by Salary Desc limit 1 offset 1)),null) as SecondHighestSalary;