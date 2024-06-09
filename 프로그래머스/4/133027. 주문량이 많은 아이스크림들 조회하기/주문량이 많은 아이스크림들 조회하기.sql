-- [7월의 아이스크림 총 주문량 + 상반기 아이스크림 총 주문량] 이 큰 순서대로 상위 3개의 맛 조회
-- 7월에는 서로 다른 두 공장에서 만들기도 한다. -> 7월 아이스크림의 맛별로 GROUP BY 필요
WITH TOTAL AS (
    SELECT *
    FROM FIRST_HALF
    UNION ALL 
    SELECT * 
    FROM JULY
)

SELECT FLAVOR
FROM TOTAL
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 3;