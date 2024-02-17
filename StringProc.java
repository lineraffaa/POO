public class StringProc {
    public static String processa(String s){
       
        if(s == null){
            return "null";
        }
        else{ 
            return s.toUpperCase();
        }
        
       
    }
    public static void main(String[] args){
        System.out.println(processa("aline"));
        System.out.println(processa(null));
    }
}
