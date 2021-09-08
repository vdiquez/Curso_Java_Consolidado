Algoritmo Ejercicio12
//	12. Se tiene en un arreglo de 20 elementos representando calificaciones de los estudiantes
//	de una escuela. Realice un algoritmo que lea el arreglo y calcule la calificación promedio
//	grupo, además, que cuente los estudiantes que obtuvieron calificaciones arriba del
//	promedio del grupo. Represéntelo mediante diagrama de flujo y pseudocódigo.
	Dimension notas(20)
	suma = 0
	promedio = 0
	contador = 0
	Para i=0 hasta 19 con paso 1 Hacer
		Escribir "Ingrese la nota ", i+1, ": "
		Leer notas(i)
		suma = suma + notas(i)
	FinPara
	promedio = suma / 20
	Para i=0 hasta 19 con paso 1 Hacer
		si notas(i)>promedio Entonces
			contador = contador + 1
		FinSi
	FinPara
FinAlgoritmo
