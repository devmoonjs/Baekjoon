-- 경기도에 위치한 창고의 [id], [이름], [주소], [냉동시설 여부] 조회
-- 냉동시설이 null일 경우 N 으로 출력 / 창고 id 기준 오름차순
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, "N") AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE "경기도%"
ORDER BY WAREHOUSE_ID;