class T002_TABMUL; /* Calcula la tabla de multiplicar del 1 al 12 para el número indicado

	global
		types
      deftuple extratuple as
        a : [1] INTEGER;
        b : [3][3] INTEGER;
      end
			deftuple tabla as
				num : [12] INTEGER;
				sol : [12] INTEGER;
        xd : extratuple;
			end
		vars
			tablaMul : tabla;
      i : INTEGER;

	create
		inicio;

  feature sum (num : INTEGER, num2: INTEGER) : INTEGER is 
  do
    return num + num2;
  end

	/* Funciones auxiliares para imprimir
	feature presentacion is
    local
      b : INTEGER;
		do

      b := tablaMul.xd.b[0][0];
			print 'T','A','B','L','A',' ','D','E',' ','M','U','L','T','I','P','L','I','C','A','R',' ','V','.','1','.','1';
      i := 1;
	end

	feature leerNum is
		do
			print 'N','ú','m','e','r','o',':',' ';
      presentacion();
	end

	feature otraVez is
		do
			print '¿','O','t','r','a',' ','v','e','z','?',' ','(','S','/','N',')',':',' ';
	end

	feature despedida is
		do
			print '¡','A','d','i','ó','s','!';
	end

	/* Features principales

	/* Rellenar la tabla
	feature crearTabla (numero : INTEGER) is
		local
			i : INTEGER;
		do
			from
				i := 1;
			until i > 13 loop
				tablaMul.num[i-1] := i;
				tablaMul.sol[i-1] := i * numero;
				i := i + 1;
			end
	end

	/* Imprimir la tabla
	feature imprimirTabla (numero : INTEGER) is
		local
			i : INTEGER;
		do
			println 'T','a','b','l','a',' ','d','e','l',' ',numero;
			from
				i := 0;
			until i = 12 loop
				print tablaMul.num[i];
				print ' ','x',' ';
				print numero;
				print ' ','=',' ';
				println tablaMul.sol[i] ;
				i := i + 1;
			end
	end

	/* Constructor
	feature inicio is
		local
			a : CHARACTER;
			ai, numero : INTEGER;
		do
			presentacion();
			from
			a := 'a';
			ai := to<INTEGER>(a);
			until ((ai = 78) or (ai = 110)) loop
				leerNum();
				read numero;
				crearTabla(numero);
				imprimirTabla(numero);
				println;
				otraVez();
				read a;
				ai := to<INTEGER>(a);
			end
			despedida();
	end

end /* T002_TABMUL

run inicio();
