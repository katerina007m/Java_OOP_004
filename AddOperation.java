

public class AddOperation implements ComplexOperation {
    //реализация метода операции сложения комплексных чисел
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}