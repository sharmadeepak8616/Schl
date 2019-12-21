package ZZZ.Interview.Interface_Abstract;

public abstract class AbstractTrail {
    /**
     * Abstract is a class which can have methods with signature as well as methods with body.
     * Implementing class has to give body to ALL methods present in Abstract class, plus it can have own variables & methods.
     */

    public void abstractMethod() {
        System.out.println("In abstract method");
    }

    public abstract int getMultiplication(int a, int b);

    public abstract int getSubstraction(int a, int b);



}
