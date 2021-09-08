Algoritmo verificacionDeEdad
	Definir anioActual Como Entero
	anioActual = 2021
	Escribir "Escriba su año de nacimiento por favor: "
	leer anioNacimiento
	verificacion = anioActual - anioNacimiento
	Si verificacion >= 18 Entonces
		escribir "Tiene ", verificacion " años, puede trabajar en la empresa."
	SiNo
		Escribir "Es menor de edad, no puede trabajar todavía."
	Fin Si
	
FinAlgoritmo
