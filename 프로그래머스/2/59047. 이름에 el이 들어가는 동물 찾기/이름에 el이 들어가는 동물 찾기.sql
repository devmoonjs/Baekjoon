-- 보호소에 있는 개 중 이름에 'el' 이 들어가는 개 (대소문자 구분 X)
-- 이름 순으로 조회
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
WHERE NAME LIKE '%el%' AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;