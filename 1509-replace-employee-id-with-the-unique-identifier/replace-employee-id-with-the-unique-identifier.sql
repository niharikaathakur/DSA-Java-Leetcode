# Write your MySQL query statement below
SELECT
EmployeeUNI.unique_id as unique_id, Employees.name
FROM Employees
lEFT JOIN EmployeeUNI
ON Employees.id = EmployeeUNI.id