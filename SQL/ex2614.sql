SELECT customers.name "name",rentals.rentals_date "rentals_date" FROM customers
    INNER JOIN rentals ON customers.id = rentals.id_customers
    WHERE rentals.rentals_date >= '2016-09-01' AND rentals.rentals_date <= '2016-09-30'