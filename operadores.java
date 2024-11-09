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

        
    }
}
