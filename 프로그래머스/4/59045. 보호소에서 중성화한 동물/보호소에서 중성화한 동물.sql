-- 보호소에 들어올 때는 중성화가 안됐지만, 나갈 때 중성화가 된 동물의 아이디와 생물종, 이름을 조회 (아이디 순서로)
SELECT A.ANIMAL_ID, A.ANIMAL_TYPE, A.NAME
FROM ANIMAL_INS AS A
JOIN ANIMAL_OUTS AS B
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.SEX_UPON_INTAKE LIKE "Intact%"
  AND B.SEX_UPON_OUTCOME NOT LIKE "Intact%"
ORDER BY ANIMAL_ID;