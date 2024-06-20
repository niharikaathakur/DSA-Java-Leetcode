# Write your MySQL query statement below
SELECT
unique_id as unique_id,name
FROM Employees e
lEFT JOIN EmployeeUNI u
ON e.id = u.id