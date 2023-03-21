package AulaRevisao1;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class ExemploRevisao {
        Scanner sc = new Scanner(System.in);
        public void exemplo1() {
            //1. Ler a primeira nota
            System.out.println("Informe a primeira nota do Aluno");
            int nota1 = sc.nextInt();

            //2. Ler a segunda nota
            System.out.println("Informe a segunda nota do Aluno");
            int nota2 = sc.nextInt();

            //3. Calcular a média
            double media = (nota1+nota2)/2;

            //4. Mostrar a média
            System.out.println("A média do Aluno é"+media);

            //5. Ler o total de aulas dadas
            int aulasDadas = sc.nextInt();

            //6. Ler a quantidades de aulas do Aluno
            System.out.println("Informe o total de faltas do Aluno");
            int totalFaltas = sc.nextInt();

            //7. Calcular a porcentagem de frequencia
            double frequencia = (aulasDadas - totalFaltas)*100/aulasDadas;
            
            //8. Mostrar a frequência
            System.out.println("A frequência do Aluno é" +frequencia+ "%");

            //9. Se a nota for maior ou igual a 50 e a frequência maior ou igual a 75 - Aprovado
            if (media>=50 && frequencia>=75) {
                System.out.println("Aluno aprovado");
            } else if(media<50 && frequencia<=75){
                System.out.println("Aluno de recuperação");
            }else{  
            //10. Indica caso reprovado
                System.out.println("Aluno reprovado");
            }    
            
        }
        
}
