package day02_variable_scanner;

public class C03_VariableOlusturmaVeKullanma {
    public static void main(String[] args) {

        int a = 10;
        a = 3 * a + 4;
        System.out.println(a);

        /*
         2 * a = a + 5;
         */
        System.out.println("a'nın yeni değeri : " + a);

        a = a + 8;
        System.out.println(a);
        System.out.println("a'nın en son değeri : " + a);
    }
}
