class PRUEBA;
global
vars
dd : DOUBLE; /*valor real
create
 main;
feature mitad (dm : DOUBLE) : DOUBLE is
//* declaración con parámetros DOUBLE y valor de retorno DOUBLE *//
/* local /* no hay declaraciones
 do
return dm / 2;
end /* mitad
feature main (i : INTEGER) is
/* local /* no hay declaraciones
 do
dd := to<DOUBLE>(i); /* casting a double
dd := mitad (dd); /* se recoge el valor de retorno
mitad (dd); /* No se recoge el valor de retorno
end /* main
end /* PRUEBA
run main(2);

