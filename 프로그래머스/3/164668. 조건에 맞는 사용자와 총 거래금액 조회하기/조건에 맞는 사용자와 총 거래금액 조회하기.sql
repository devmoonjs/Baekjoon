SELECT USER_ID, NICKNAME, SUM(A.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD AS A
INNER JOIN USED_GOODS_USER AS B
ON A.WRITER_ID = B.USER_ID
WHERE A.STATUS = 'DONE'
GROUP BY WRITER_ID
HAVING SUM(A.PRICE) >= 700000 
ORDER BY TOTAL_SALES;