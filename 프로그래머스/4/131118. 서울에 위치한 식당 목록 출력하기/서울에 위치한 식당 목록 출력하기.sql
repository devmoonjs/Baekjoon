 -- 서울에 위치한 식당들의 '식당ID' , '식당 이름' , '음식 종류' , '즐겨찾기 수' , '주소' , '리뷰 평균 점수'
 -- 리뷰 평균 -> 세번째 자리에서 반올림
 -- 평균점수를 기준으로 내림차순 정렬
 
 
SELECT 
    A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, 
    A.ADDRESS, ROUND(AVG(B.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO AS A
JOIN REST_REVIEW AS B
ON A.REST_ID = B.REST_ID
WHERE LEFT(ADDRESS, 2) = '서울'
GROUP BY B.REST_ID
ORDER BY SCORE DESC, FAVORITES DESC;