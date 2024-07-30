package edu.mauro.anatomiaclasses;
import java.util.Scanner;
public class BoletimEstudantil {
    /**
     * @param mediaFinal
     * @return
     */
    public static String mediaFinal(float mediaFinal, String primeiroNome, String segundoNome) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome:");
        String nomeCompleto = sc.nextLine();
        
        float nota = 0;
        String resultado;
        System.out.println("Entre com a nota:");
        nota = sc.nextFloat();
        if(nota < 6){
            resultado = "REPROVADO";
        }
        else if(nota == 6){
            resultado = "PROVA MINERVA! E sua nota foi:"+ nota ;
        }
        else{
             resultado = "APROVADO! E sua nota foi: "+ nota;
        }
        
        sc.close();
        return "Nome do aluno: " + nomeCompleto + "\n"+ resultado;       
    }
    
}
