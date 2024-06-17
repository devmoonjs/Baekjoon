-- [22년 4월 13일] 에 취소되지 않은 [흉부외과(CS) 진료 에약 내역] 조회
-- [APNT_CNCL_YN] 이 [N] 이면 예약 취소
-- 진료예약일시를 기준으로 오름차순 정렬

WITH P AS (
    SELECT *
    FROM APPOINTMENT
    WHERE 
        DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13' AND
        MCDP_CD = "CS" AND 
        APNT_CNCL_YN = "N"
)

SELECT A.APNT_NO, B.PT_NAME, A.PT_NO, C.MCDP_CD, C.DR_NAME, A.APNT_YMD
FROM P AS A
JOIN PATIENT AS B
ON A.PT_NO = B.PT_NO
JOIN DOCTOR AS C
ON A.MDDR_ID = C.DR_ID
ORDER BY A.APNT_YMD;