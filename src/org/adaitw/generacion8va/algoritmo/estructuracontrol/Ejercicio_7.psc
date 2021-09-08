Algoritmo Ejercicio7
	Definir edad Como Entero
	Definir promedio Como Real
	Escribir "Ingrese edad del alumno"
	Leer edad
	Escribir "Ingrese promedio del alumno"
	Leer promedio
	Si edad > 18 Entonces
		Si promedio>=9 Entonces
			Escribir "La beca será de $2000.00"
		FinSi
		Si promedio>=7.5 y promedio<9 Entonces
			Escribir "La beca será de $1000.00"
		FinSi
		Si promedio>=6 y promedio<7.5 Entonces
			Escribir "La beca será de $500.00"
		FinSi
		Si promedio<6 Entonces
			Escribir "Se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar."
		Fin Si
	SiNo
		Si promedio>=9 Entonces
			Escribir "La beca será de $3000.00"
		FinSi
		Si promedio>=7.5 y promedio<9 Entonces
			Escribir "La beca será de $2000.00"
		FinSi
		Si promedio>=6 y promedio<7.5 Entonces
			Escribir "La beca será de $100.00"
		FinSi
		Si promedio<6 Entonces
			Escribir "Se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar."
		Fin Si
	Fin Si
FinAlgoritmo
