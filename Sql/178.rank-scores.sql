--  Write your MySQL query statement below
 SELECT score,DENSE_RANK() over(order by score DESC) as 'rank' from Scores;

select s1.score,(select count(distinct s2.score) from scores s2 where s2.score>=s1.score) as 'rank' from Scores s1 order by s1.score desc;

select s.score,count(distinct t.score) as 'rank' from Scores s inner join Scores t on s.score <=t.score group by s.id,s.score order by s.score desc;