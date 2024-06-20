# Write your MySQL query statement below
SELECT e.name , b.bonus
FROM Employee as e
LEFT JOIN Bonus b
ON e.empID = b.empID
WHERE b.bonus<1000 or b.bonus is null
