public class charstr { 
    public static void main(String[] args){
    
    char palavra = 'y';

    StringBuffer palavra2 = new StringBuffer();
    
    palavra2.append(palavra);
    System.out.println(palavra2);
    palavra2.insert(0,'p');
    System.out.println(palavra2);
    } 
}
