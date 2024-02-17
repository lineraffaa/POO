public class Sol {
    public static void main(String[] args) {
       System.out.println(args[0]+" "+args[1]);
       metodo(args[0], args[1]);
       
 
    }
    
    public static void metodo(String palavra, String palavra2){

        if(palavra.equals(palavra2))
            System.out.println("Sao iguais!");
        
        else
            System.out.println("Sao diferentes!");
        
        
        if(palavra.equalsIgnoreCase(palavra2))
            System.out.println("Sao iguais!");
        else
            System.out.println("Sao diferentes!");
        
        }
    }

    

