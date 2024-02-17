public class ExerSoma {
    public static void main (String[] args){
        System.out.println(soma(100,800));

    }

    public static int soma(int... values){
        
        int soma = 0;
        
        for(int i = 0; i < values.length; i++){
            soma += values[i];
        }
        return soma;

    }
    
}
