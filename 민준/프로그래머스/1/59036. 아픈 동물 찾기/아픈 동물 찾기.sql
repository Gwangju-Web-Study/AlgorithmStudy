-- 코드를 입력하세요
SELECT 
    ai.ANIMAL_ID, 
    ai.NAME
from ANIMAL_INS as ai
where ai.INTAKE_CONDITION = 'Sick'
order by ai.ANIMAL_ID;