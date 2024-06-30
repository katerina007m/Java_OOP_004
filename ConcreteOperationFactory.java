

public class ConcreteOperationFactory implements OperationFactory {
    @Override
    public ComplexOperation createAddOperation() {
        return new AddOperation(); //сложение
    }

    @Override
    public ComplexOperation createSubtractOperation() {
        return new SubtractOperation(); //вычитание
    }

    @Override
    public ComplexOperation createMultiplyOperation() {
        return new MultiplyOperation(); //умножение
    }

    @Override
    public ComplexOperation createDivideOperation() {
        return new DivideOperation(); //деление
    }
}