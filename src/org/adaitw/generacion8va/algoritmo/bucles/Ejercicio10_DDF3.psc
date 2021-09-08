Algoritmo sin_titulo
//	10. Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un
//	algoritmo que lea los arreglos y que determine si la diagonal principal de la primera es
//	igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I,
	//	J son iguales). Represente la solución mediante el diagrama de flujo y el pseudocódigo.
	tamanioMatriz=4
	Escribir "Primer matriz"
	Dimension matriz1(tamanioMatriz, tamanioMatriz)
	Dimension matriz2(tamanioMatriz,tamanioMatriz)
	Para i=0 hasta tamanioMatriz-1 Con Paso 1 Hacer
		para j=0 hasta tamanioMatriz-1 con paso 1 Hacer
			Escribir "El valor en el punto [", i, ", ", j, "] de la matriz 1 es:"
			Leer matriz1(i, j)
		FinPara
	FinPara
	Escribir "Segunda matriz"
	Para i=0 hasta tamanioMatriz-1 Con Paso 1 Hacer
		para j=0 hasta tamanioMatriz-1 con paso 1 Hacer
			Escribir "El valor en el punto [", i, ", ", j, "] de la matriz2 es:"
			Leer matriz2(i, j)
		FinPara
	FinPara
	contador = 0
	Para i=0 hasta tamanioMatriz-1 Con Paso 1 Hacer
		para j=0 hasta tamanioMatriz-1 con paso 1 Hacer
			Si i==j entonces
				si matriz1(i,j)=matriz2(i,j)
					Escribir "Los valores en [", i, ", ", j, "] en ambas matrices son iguales"
					contador = contador+1
				SiNo
					Escribir "Los valores en [", i, ", ", j, "] en ambas matrices no son iguales"
				FinSi
			FinSi
		FinPara
	FinPara
	Si contador==tamanioMatriz Entonces
		Escribir "Las diagonales son iguales"
	SiNo
		Escribir "Las diagonales no son iguales"
	FinSi
FinAlgoritmo
