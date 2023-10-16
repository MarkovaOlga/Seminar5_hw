package calculatorMVC.model.divideOperation;

public class DivideOperation {
    public DivideOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double divide() {
        return firstArg/secondArg;
    }
}

