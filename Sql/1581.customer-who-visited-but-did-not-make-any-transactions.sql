# Write your MySQL query statement below
# select v.customer_id,count(*) as 'count_no_trans' from Visits v left join Transactions t on v.visit_id=t.visit_id where t.transaction_id is null group by v.customer_id;

SELECT customer_id, COUNT(visit_id) as count_no_trans 
FROM Visits v
WHERE NOT EXISTS (
	SELECT visit_id FROM Transactions t 
	WHERE t.visit_id = v.visit_id
	)
GROUP BY customer_id