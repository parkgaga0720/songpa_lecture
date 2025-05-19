/* LIMIT */
/* SELECT문의 결과 집합에서 반환할 행의 수를 제한하는데 사용된다. */

-- 전체 행 조회
SELECT
       MENU_CODE
     , MENU_NAME
     , MENU_PRICE
  FROM TBL_MENU
  ORDER BY MENU_PRICE DESC;

-- 2번 행부터 5번 행까지 조회  
SELECT
       MENU_CODE
     , MENU_NAME
     , MENU_PRICE
  FROM TBL_MENU
  ORDER BY MENU_PRICE DESC
  LIMIT 1, 4;
  
-- 상위 다섯 줄의 행만 조회
SELECT
       MENU_CODE
     , MENU_NAME
     , MENU_PRICE
  FROM TBL_MENU
  ORDER BY MENU_PRICE DESC,
           MENU_NAME ASC
  LIMIT 5;