SELECT
    A.TF0001 as id_frecuencia,
    A.TF0002 as frecuencia,
    GROUP_CONCAT(
        JSON_OBJECT(
            'id_sitio', D.CS0001,
            'id_frecuencia', A.TF0001,
            'frecuencia', A.TF0002,
            'ruta', B.FB0013,
            'sitio', D.CS0003,
            'id_servicio', B.FB0008
        ) 
        ORDER BY D.CS0001, B.FB0013
    ) AS origen,
    GROUP_CONCAT(
        JSON_OBJECT(
            'id_sitio', D.CS0001,
            'id_frecuencia', A.TF0001,
            'frecuencia', A.TF0002,
            'ruta', 'DESTINO',
            'sitio', D.CS0003,
            'id_servicio', B.FB0008
        ) 
        ORDER BY D.CS0001
    ) AS destino
FROM FRET_00037 as A  
LEFT JOIN F00021 as B ON A.TF0001 = B.FB0007
LEFT JOIN CCS00012 as C on C.CCS0001  = B.FB0010  
LEFT JOIN C00007 AS D on D.CS0001 = B.FB0003
WHERE D.CS0001 IN (78, 18, 81)
GROUP BY A.TF0001, A.TF0002;
