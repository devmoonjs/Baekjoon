-- 동물 보호소에 들어온 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ("Lucy", "Ella", "Pickle", "Rogan", "Sabrina", "Mitty")
ORDER BY ANIMAL_ID;