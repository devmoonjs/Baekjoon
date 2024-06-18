--  노선별로 노선, 총 누계 거리, 평균 역 사이 거리를 노선별로 조회
SELECT ROUTE, 
       CONCAT(ROUND(SUM(D_BETWEEN_DIST),1), "km") AS TOTAL_DISTANCE, 
       CONCAT(ROUND(AVG(D_BETWEEN_DIST),2), "km") AS AVERAGE_DISTANCE
       
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY SUM(D_BETWEEN_DIST) DESC;