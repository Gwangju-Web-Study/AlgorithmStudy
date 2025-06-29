-- 코드를 입력하세요
SELECT ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS as ai 
where INTAKE_CONDITION != 'Aged'
order by ai.ANIMAL_ID
