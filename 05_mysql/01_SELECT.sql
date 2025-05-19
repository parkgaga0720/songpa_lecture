/* SELECT */
/* SELECT절은 MYSQL의 가장 기본적인 명령어로
   특정 테이블에서 원하는 데이터를 조회해서 가져오는데 사용 된다. */
   
SELECT 
       MENU_NAME
  FROM TBL_MENU;
  
SELECT
       MENU_CODE
	 , MENU_NAME
     , MENU_PRICE
  FROM TBL_MENU;
  
SELECT * FROM TBL_MENU;

SELECT 6 + 3;
SELECT 6 * 3;
SELECT 6 % 3;

SELECT NOW();

-- 컬럼 별칭
SELECT CONCAT('홍', '', '길동') AS name;