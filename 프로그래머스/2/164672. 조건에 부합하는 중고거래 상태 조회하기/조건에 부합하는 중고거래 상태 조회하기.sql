-- 22년 10월 5일에 등록된 게시물의 정보 출력 -> 거래상태가 slase 이면 판매중, reserved면 예약중, done 이면 거래완료

SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
    CASE
    WHEN STATUS = 'SALE' THEN '판매중'
    WHEN STATUS = 'RESERVED' THEN '예약중'
    WHEN STATUS = 'DONE' THEN '거래완료'
    END AS STATUS
FROM USED_GOODS_BOARD
WHERE CREATED_DATE = '2022-10-05'
ORDER BY BOARD_ID DESC;