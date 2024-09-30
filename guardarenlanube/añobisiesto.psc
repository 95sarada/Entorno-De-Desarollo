Algoritmo añobisiestono
	Definir año Como Entero
	Escribir "Igrese el año: "
    Leer  año
	//A year is a leap year if it is divisible by 4, but not by 100 , unless it is also divisible by 400
	si (año % 4 = 0 ) y (año % 100 <> 0) o (año % 400 = 0)Entonces
		Escribir "El año", año, "es bisiesta."
	SiNo
		Escribir "El año " , año, " no es bisiesta"
	FinSi
	
FinAlgoritmo
