public class Media {
    public static void main(String[] args) {
        int[ ] numero = {100,140,30,120,90};
        int soma = 0; 
        double media = 0; 

        for(int i = 0; i < numero.length;i++){
            soma += numero[i];

        }
        media = soma/5;
        System.out.println("media " + media);
    }
}
