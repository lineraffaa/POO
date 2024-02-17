package ponto;

public class TestaPonto2D {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        System.out.println(Ponto2D.getContador());
        Ponto2D p2 /* instancias e objetos */ = new Ponto2D(3.9, 5.3);
        System.out.println(Ponto2D.getContador());
        System.out.println("Numero objetos criados: " + Ponto2D.getContador());

        // System.out.println("Coordenadas de p1:");
        System.out.println(p1.getx() + "\n");
        System.out.println(p2.getx() + "\n");
        System.out.println(p1.gety() + "\n");
        System.out.println(p2.gety() + "\n");

    }

}
/*
 * public class X {
 * private int cont;
 * public void setCont(int cont) {
 * this.cont = cont;
 * }
 * }
 * 
 * a. A classe descrita a seguir está correta? Se incorreta justifique sua
 * resposta.
 * public class Y {
 * public static void main (String[ ] args) {
 * X ob = new X();
 * ob.cont = 10;
 * }
 * }
 * 
 * por causa do modificador private não é possivel acessar o cont, só é visivel
 * na classe X. o correto é utilizar o metodo setcont,que troca o valor
 * do atributo cont
 */

/*
 * 3) finalize a construção do método troca() na classe UsaTest realizando a
 * troca entre os
 * parâmetros ob1 e ob2. Exiba as informações antes e depois da troca. Por que
 * isso ocorre?
 * public class UsaTest {
 * public static void main(String[] args) {
 * Test test1 = new Test(5);
 * Test test2 = new Test(10);
 * System.out.println("Antes da troca");
 * System.out.println("ob1.a = " + test1.getA());
 * System.out.println("ob2.a = " + test2.getA());
 * troca (test1, test2);
 * 
 * System.out.println("Depois da troca");
 * System.out.println("ob1.a = " + test1.getA());
 * System.out.println("ob2.a = " + test2.getA());
 * }
 * public static void troca(Test ob1, Test ob2) {
 * Test aux = new Test(0);
 * ob1 = ob2;
 * ob2 = aux;
 * }
 * }
 * 
 */

/*
 * 4) public class X {
 * public int metodo1(int a, int b){
 * return a+b;
 * ...
 * }
 * public String metodo1(int a, int b) {
 * ... return "ola";
 * }
 * não funciona, pois não é possivel executar os dois ao mesmo tempo
 */

/*
 * 5)Se todos os objetos de uma classe tiverem que compartilhar a mesma
 * variável, como
 * você deve declarar essa variável? declarar como static, global todos
 * conseguem acessar
 */

/*
 * 6) Para que um membro só possa ser acessado por outros membros de sua classe,
 * que
 * modificador de acesso deve ser usado?
 * utilizando o modificador de acesso private, que ira restringe o acesso aos
 * membros a partir da classe
 */

/*
 * 7)Um argumento int é passado para um método de uma classe com o uso da
 * chamada
 * por .... parâmetro
 */