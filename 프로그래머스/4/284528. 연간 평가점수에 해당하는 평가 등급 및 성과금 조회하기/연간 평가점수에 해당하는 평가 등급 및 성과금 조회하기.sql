-- 사번, 성명, 평가 등급, 성과금을 조회
-- 점수별 평가 등급을 JOIN 하고 -> 성과금 계산해서 JOIN
WITH S AS (
    SELECT EMP_NO, AVG(SCORE) AS SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
),

G AS (
    SELECT S.EMP_NO,
           CASE 
           WHEN S.SCORE >= 96 THEN "S"
           WHEN S.SCORE >= 90 AND S.SCORE < 96 THEN "A"
           WHEN S.SCORE >= 80 AND S.SCORE < 90 THEN "B"
           WHEN S.SCORE < 80 THEN "C"
           END AS GRADE
    FROM HR_GRADE
    JOIN S
    ON HR_GRADE.EMP_NO = S.EMP_NO
    GROUP BY EMP_NO
)

SELECT A.EMP_NO, A.EMP_NAME, G.GRADE, 
       CASE
       WHEN G.GRADE = "S" THEN A.SAL * 0.2
       WHEN G.GRADE = "A" THEN A.SAL * 0.15
       WHEN G.GRADE = "B" THEN A.SAL * 0.1
       WHEN G.GRADE = "C" THEN 0
       END AS BONUS  
FROM HR_EMPLOYEES AS A
JOIN G
ON A.EMP_NO = G.EMP_NO
ORDER BY A.EMP_NO;