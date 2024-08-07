WITH RECURSIVE TEMP AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM TEMP
    WHERE HOUR < 23
)

SELECT A.HOUR, COUNT(B.ANIMAL_ID) AS COUNT
FROM TEMP AS A
LEFT JOIN ANIMAL_OUTS AS B
ON A.HOUR = HOUR(B.DATETIME)
GROUP BY A.HOUR
ORDER BY A.HOUR;