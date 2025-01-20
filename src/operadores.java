public class operadores {
    public static void main(String[] args) throws Exception {
    /*    int numero = 5;

        //x repretição
        
        //numero =numero + 1;

        System.out.println(numero --); 

        System.out.println(numero); 


        boolean variavel = true;
        
        variavel = !variavel;
        
        System.out.println(variavel);//  */

        /*
        //forma 1
        int a, b;

        a = 5;
        b = 6;
        
        String resultado = "";
        
        if(a==b)
            resultado ="verdadeiro";
        else
            resultado ="falso";

        System.out.println(resultado); */


        //forma mais resumida

        /*
         int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";

        //não se limita somente a string, possivel utilizar int também...

        System.out.println(resultado);
        */


        /* 

        String  nomeUm = "GLEYSON";
        String nomeDois =  new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 =1;
        int numero2 =2;

      boolean simNao = numero1 == numero2;


      if(numero1 == numero2){ //true
        System.out.println("A nossa condição e verdadeira");
      }
      
      System.out.println("numeroUm é igual a numeroDois? " + simNao);
      
      simNao = numero1 != numero2;

      System.out.println("numeroUm é diferente numeroDois? " + simNao);

      simNao = numero1 > numero2;

      System.out.println("numeroUm é maior que numeroDois? " + simNao);
        */

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        }

        /* 
         * if(condicao1 && (7 > 4) ){
            System.out.println("As duas condições são verdadeiras!");
        }
        */

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições são verdadeiras!");
        }

        System.err.println("Fim");

        
        
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        double a, b, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para calcular a Media aritmetica ");
        a = sc.nextDouble();


        System.out.println("Digite o segundo numero ");
        b = sc.nextDouble();

        result = (a + b) / 3;
        System.out.printf("A media é: %.2f\n", result);
        sc.close();

    }
}


class aritmetica {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        double f,c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para calcular a media aritmetica");
        c = sc.nextDouble();

        f = (c * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é " + f);
        sc.close();
    }
}


class hiportenusa {
    public static void main(String[] args){
        double cateto1, cateto2, hipot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para o primeiro cateto: ");
        cateto1 = sc.nextDouble();

        System.out.println("Digite um numero para o primeiro cateto: ");
        cateto2 = sc.nextDouble();

       hipot = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
       System.out.printf("A hipotenusa é:  %.2f\n",  hipot);
    }
}


class ifelse {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Bom dia");
            if (x >= 4) {
                System.out.println("Boa Tarde");
            }
            else {
                System.out.println("boa noite");
            }
    }
}



class teste {
    public static void main(String[] args){
        int x = 4;
        System.out.println("BEM VIDO AO JOGO DA NOITE E TARDE");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero para definir o horario do dia: ");
        x = sc.nextInt();

        if (x >= 4) {
            System.out.println("Boa Tarde");
        }
        else {
            System.out.println("boa noite");
        }
    }
}



class testarray {
    public static void main(String[] args){
ArrayList<String> lista = new ArrayList<>();

// Adicionando elementos
lista.add("Maçã");
lista.add("Banana");

// Acessando elementos
System.out.println(lista.get(0));  // Imprime "Maçã"

// Atualizando um elemento
        lista.set(1, "Laranja");  // Troca "Banana" por "Laranja"

// Removendo elementos
lista.remove(0);  // Remove "Maçã"

// Iterando
for (String item : lista) {
        System.out.println(item);
        }
    }
}

class ternario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double preco =34.5;                                             //Estrutura condicional Ternaria
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        sc.close();
    }
}

class whiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}


class fores{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;                                       //estrutura for
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;

        }
        System.out.println(soma);


        //for (int i=o; i <5; i++) {                    //contagem
        //System.out.println("Valor de i: " + i);

        //for (int i=4; i>=0; i--) {                    //contagem regressiva
        //System.out.println("Valor de i: " + i);
        }
    }

        
