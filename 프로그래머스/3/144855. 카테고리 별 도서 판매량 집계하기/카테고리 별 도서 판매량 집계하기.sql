SELECT CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK AS A
JOIN BOOK_SALES AS B
ON A.BOOK_ID = B.BOOK_ID
WHERE MONTH(B.SALES_DATE) = '01'
GROUP BY A.CATEGORY
ORDER BY CATEGORY;