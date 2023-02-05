# Write your MySQL query statement below
select e1.name as 'Employee' from Employee e1 inner join Employee as e2 on e1.ManagerId=e2.id where e1.salary>e2.salary;