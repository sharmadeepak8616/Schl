package ZZZ.Interview.Interface_Abstract;

public class ImplementingClass extends AbstractTrail implements InterfaceTrial {

    public void printMyName() {
        System.out.println("Happy world");
    }

    public int addNumbers(int a, int b) {
        return a+b;
    }

    public void getMonth() {
        System.out.println("hello dear");
    }


    @Override
    public int getMultiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int getSubstraction(int a, int b) {
        return a-b;
    }
}
