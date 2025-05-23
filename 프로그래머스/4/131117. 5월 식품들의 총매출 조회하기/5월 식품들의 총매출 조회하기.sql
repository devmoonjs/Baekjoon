# 생산일자가 22년 5월인 식품들
# 식품 iD , 식품 이름 , 총매출(AMOUNT * PRICE)
# 총매출 desc , 식품ID asc
WITH PRODUCTS AS (
    SELECT
        PRODUCT_ID,
        SUM(AMOUNT) AS AMOUNT
    FROM FOOD_ORDER
    WHERE YEAR(PRODUCE_DATE) = '2022' AND MONTH(PRODUCE_DATE) = '05'
    GROUP BY PRODUCT_ID
)

SELECT
    A.PRODUCT_ID AS 'PRODUCT_ID',
    A.PRODUCT_NAME AS 'PRODUCT_NAME',
    A.PRICE * B.AMOUNT AS 'TOTAL_SALES'
FROM FOOD_PRODUCT AS A
JOIN PRODUCTS AS B
ON A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID; 