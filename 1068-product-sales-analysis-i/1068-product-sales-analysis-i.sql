# Write your MySQL query statement below

select pt.product_name as product_name , s.year as year , s.price as price from sales s left join product pt on s.product_id = pt.product_id