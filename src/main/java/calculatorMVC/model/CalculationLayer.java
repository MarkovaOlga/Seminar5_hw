package calculatorMVC.model;

import calculatorMVC.model.divideOperation.DivideOperation;
import calculatorMVC.model.multiplyOperation.MultiplyOperation;
import calculatorMVC.model.substractOperation.SubstractOperation;
import calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        SumOperation sumOperation = new SumOperation(a,b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        SubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.subtract();
    }

    public double multiply(double a, double b) {
        // Умножение
        MultiplyOperation multiplyOperation = new MultiplyOperation(a, b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        // Деление
        DivideOperation divideOperation = new DivideOperation(a, b);
        return divideOperation.divide();
    }
}