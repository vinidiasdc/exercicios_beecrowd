SELECT lawyers.name, lawyers.customers_number FROM lawyers 
WHERE lawyers.customers_number = (SELECT MAX(lawyers.customers_number) FROM lawyers)
UNION ALL
SELECT lawyers.name, lawyers.customers_number FROM lawyers 
WHERE lawyers.customers_number = (SELECT MIN(lawyers.customers_number) FROM lawyers)
UNION ALL
SELECT 'Average',ROUND(AVG(lawyers.customers_number)) FROM lawyers