-- '세단' 자동차 중에서 10월 대여 시작 기록이 있는 자동차 id 리스트 출력 (중복이 없어야 함)
-- id 기준 내림차순

SELECT CAR_ID
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_ID IN (SELECT DISTINCT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                 WHERE MONTH(START_DATE) = 10)
    AND CAR_TYPE = '세단'
ORDER BY CAR_ID DESC;