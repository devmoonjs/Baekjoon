-- 상품 카테고리별 상품의 개수를 출력 -> 맨 앞 글자 2개가 카테고리를 의미

SELECT SUBSTRING(PRODUCT_CODE, 1,2) AS CATEGORY, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY SUBSTRING(PRODUCT_CODE, 1,2)
ORDER BY SUBSTRING(PRODUCT_CODE, 1,2);