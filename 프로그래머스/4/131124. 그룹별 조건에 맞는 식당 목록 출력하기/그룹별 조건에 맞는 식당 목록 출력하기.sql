-- 가장 리뷰를 많이 쓴 회원의 리뷰들을 출력
-- memberID 별로 묶어서 count => order by count desc limit 1
WITH PERSON AS (
    SELECT MEMBER_ID, COUNT(MEMBER_ID) AS REVIEW_COUNT
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY REVIEW_COUNT DESC
    LIMIT 1
)

SELECT A.MEMBER_NAME, C.REVIEW_TEXT, DATE_FORMAT(C.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE AS A
JOIN PERSON AS B ON A.MEMBER_ID = B.MEMBER_ID
JOIN REST_REVIEW AS C ON B.MEMBER_ID = C.MEMBER_ID
ORDER BY REVIEW_DATE, REVIEW_TEXT;