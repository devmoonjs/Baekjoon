-- '5/1'을 기준으로 주문ID, 제품ID, 출고일자, 출고여부를 조회
-- 5/1일까지는 출고완료 // 이후 날짜는 출고 대기 // 미정 -> 출고미정
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,'%Y-%m-%d') AS OUT_DATE, 
    CASE WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
         WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
         WHEN OUT_DATE IS NULL THEN '출고미정'
         END
         AS '출고여부'
FROM FOOD_ORDER
ORDER BY ORDER_ID;