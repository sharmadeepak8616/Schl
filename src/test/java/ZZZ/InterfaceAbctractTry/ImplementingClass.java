package ZZZ.InterfaceAbctractTry;

public class ImplementingClass extends AbstractTry implements InterfaceTry {

    public void add(int a, int b) {
        System.out.println("Interface method, add : " + a+b);
    }

    public void add1(int a, int b) {
        System.out.println("Interface method, add1 : " + a+b);
    }

    public void hello(String a) {
        System.out.println("HEllo " + a);
    }

    public void mul(int a, int b) {
        System.out.println("Abstract method, mul : " + a*b);
    }

    public void div(int a, int b) {
        System.out.println("New body for method");
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Cannot create an object of Abstract class
        //AbstractTry a = new AbstractTry();

    }

}
