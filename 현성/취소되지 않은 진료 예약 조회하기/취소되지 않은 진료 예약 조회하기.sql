SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, D.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM APPOINTMENT A
JOIN PATIENT P
ON A.PT_NO = P.PT_NO
JOIN DOCTOR D
ON A.MDDR_ID = D.DR_ID
WHERE TO_CHAR(A.APNT_YMD, 'YYYY-MM-DD') = '2022-04-13'
AND A.APNT_CNCL_YN = 'N'
AND D.MCDP_CD = 'CS'
ORDER BY A.APNT_YMD