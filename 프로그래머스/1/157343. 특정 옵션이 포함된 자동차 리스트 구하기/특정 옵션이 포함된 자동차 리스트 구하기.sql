-- '네비게이션' 옵션이 포함된 자동차 리스트를 출력
SELECT *
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE CONCAT('%', "네비게이션", '%')
ORDER BY CAR_ID DESC;