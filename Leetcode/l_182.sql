# Write your MySQL query statement below
SELECT email FROM
(SELECT email, COUNT(email) AS c
FROM Person 
GROUP BY email) AS temp
WHERE c > 1