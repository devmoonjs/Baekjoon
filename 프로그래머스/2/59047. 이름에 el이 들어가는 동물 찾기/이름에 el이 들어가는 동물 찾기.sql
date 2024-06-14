-- 보호소에 있는 개 중 이름에 'el' 이 들어가는 개의 아이디와 이름을 조회 (대소문자 구분 X)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Dog' AND NAME LIKE '%el%'
ORDER BY NAME;