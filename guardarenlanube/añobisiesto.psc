Algoritmo a�obisiestono
	Definir a�o Como Entero
	Escribir "Igrese el a�o: "
    Leer  a�o
	//A year is a leap year if it is divisible by 4, but not by 100 , unless it is also divisible by 400
	si (a�o % 4 = 0 ) y (a�o % 100 <> 0) o (a�o % 400 = 0)Entonces
		Escribir "El a�o", a�o, "es bisiesta."
	SiNo
		Escribir "El a�o " , a�o, " no es bisiesta"
	FinSi
	
FinAlgoritmo
