class PRUEBA;

global
  types
    deftuple tuple1 as /*estructura
      a: INTEGER;
      c: CHARACTER;
      d: DOUBLE;
    end
  vars
    t : tuple1; /*estructura
    dd : DOUBLE; /*valor real

create
  main;

feature main INTEGER is
  local
    ai : [2] INTEGER; /*array de una dimensión
    bi : [2][2] INTEGER; /*array de dos dimensiones
    g, h : INTEGER; /* Son posible declaraciones múltiples de variables
  do
    /* sentencias del método constructor inicioend
  end /*main
end /*PRUEBA

run main(); /* Arranque
