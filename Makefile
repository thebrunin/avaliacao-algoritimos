run: build
	# Executando..
	java -cp bin Main

build:
	# Compilando..
	javac -d bin Main.java

clean:
	# Removendo..
	rm -r bin

git:
	git config --global user.name "Darlon Vasata"
	git config --global user.email "darlonv@gmail.com"


build_q1: build
	#Compilando arquivo de teste
	javac -d bin test/TestQ1.java
	
testq1: build_q1
	#Executando teste
	java -ea -cp bin test/TestQ1
	# java -ea -cp bin test/TestQ2

