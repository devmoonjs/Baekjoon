-- 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회
-- 기본 경로는 '/home/grep/src/' + 게시글 ID / + 파일 ID + FILE_NAME + FILE_EXT
WITH BEST AS (
    SELECT * 
    FROM USED_GOODS_BOARD
    ORDER BY VIEWS DESC
    LIMIT 1
)

SELECT CONCAT('/home/grep/src/', A.BOARD_ID, '/', B.FILE_ID, B.FILE_NAME, B.FILE_EXT) AS FILE_PATH
FROM BEST AS A
JOIN USED_GOODS_FILE AS B
ON A.BOARD_ID = B.BOARD_ID
ORDER BY B.FILE_ID DESC;
