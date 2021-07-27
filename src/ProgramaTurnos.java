import java.util.Scanner;
public class ProgramaTurnos {
public static void main(String[]args) {
System.out.println("Turnos de Trabalho ");
System.out.println("Matriculas existentes 1001; 1002; 1003 ");
	Scanner input= new Scanner(System.in);
	
	System.out.println("Digite sua Matricula");
	
	double matricula;
	matricula= input.nextDouble();
	
	String nome1= "Fulano";
	String nome2= "Bertano";
	String nome3= "Ciclano";
	
	String turno1= " 06:00 ás 14:00";	
	String turno2= " 14:00 ás 22:00";
	String turno3= " 22:00 ás 06:00";
	
	double cadastro1= 1001;	
	double cadastro2= 1002;
	double cadastro3= 1003;
	
	if(matricula == cadastro1) {
	System.out.println("Funcionário: " + nome1 +" do 1°Turno" + turno1 );
	
		}
	else if(matricula == cadastro2) {
		System.out.println("Funcionário: " + nome2 + " do 2°Turno" + turno2 );
	}
	
	
	else if(matricula == cadastro3) {
	System.out.println("Funcionário: " + nome3 + " do 3°Turno" + turno3 );			
	
	
	}
	
	else if ((matricula >cadastro3)||(matricula <cadastro1)) {
     System.out.println("Matricula inexistente");
     
	}
	

	}
	}
		
		
		
		
		
		
		
		
		
	
