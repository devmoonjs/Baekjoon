SELECT CAR_TYPE, COUNT(CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%가죽시트%' or OPTIONS LIKE '%통풍시트%' or OPTIONS LIKE '%열선시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

# SELECT CAR_TYPE, OPTIONS
# FROM CAR_RENTAL_COMPANY_CAR
# WHERE OPTIONS LIKE '%가죽시트%' or OPTIONS LIKE '%통풍시트%' or OPTIONS LIKE '%열선시트%'
# ORDER BY CAR_TYPE;

# SELECT * FROM CAR_RENTAL_COMPANY_CAR;