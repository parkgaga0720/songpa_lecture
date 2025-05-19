/* GROUPING */
/* GROUP BY절은 결과 집합을 특정 열의 값에 따라 그룹화 하는데 사용된다. 
   HAVING은 GROUP BY절과 함께 사용해야 하며 그룹에 대한 조건을 적용하는데 사용된다. */

/* 1. GROUP BY */   
SELECT
       CATEGORY_CODE
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE;
  
-- COUNT 함수 활용
SELECT
       CATEGORY_CODE
     , COUNT(*)
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE;
  
-- SUM 함수 활용
SELECT
       CATEGORY_CODE
     , SUM(MENU_PRICE)
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE;
  
-- AVG 함수 활용
SELECT
       CATEGORY_CODE
     , AVG(MENU_PRICE)
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE;
  
-- 2개 이상의 그룹 생성
SELECT
       MENU_PRICE
     , CATEGORY_CODE
  FROM TBL_MENU
  GROUP BY MENU_PRICE
         , CATEGORY_CODE;
         
/* 2. HAVING */         
/* 5번 카테고리(중식)부터 8번 카테고리(커피)까지의 메뉴 카테고리 번호 조회 */
SELECT
       CATEGORY_CODE
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE
  HAVING CATEGORY_CODE BETWEEN 5 AND 8;
  
/* 3. ROLL UP */ 
-- 컬럼 한 개를 활용한 ROLLUP(카테고리의 총합)
SELECT
       CATEGORY_CODE
     , SUM(MENU_PRICE)
  FROM TBL_MENU
  GROUP BY CATEGORY_CODE
  WITH ROLLUP;
  
-- 컬럼 두 개를 활용한 ROLLUP(같은 메뉴 가격별 총합 및 해당 메뉴 가격별 같은 카테고리의 총합)
SELECT
       MENU_PRICE
     , CATEGORY_CODE
     , SUM(MENU_PRICE)
  FROM TBL_MENU
  GROUP BY MENU_PRICE
         , CATEGORY_CODE
  WITH ROLLUP;       