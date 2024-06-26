1. Принцип единственной ответственности (Single Responsibility Principle):

    Класс Calculator отвечает за выполнение операции с комплексными числами на 
    основе переданной операции. Он может считаться соблюдающим принцип единственной ответственности,
     поскольку его основная цель - вычисление результата на основе входных параметров.

2. Принцип открытости/закрытости (Open/Closed Principle):

    Классы AddOperation, SubtractOperation, MultiplyOperation и DivideOperation 
    следуют этому принципу, поскольку они реализуют интерфейс ComplexOperation и могут быть легко 
    расширены новыми операциями без изменения существующего кода.

3. Принцип разделения интерфейса (Interface Segregation Principle):

    Интерфейс ComplexOperation представляет операцию над комплексными числами и определяет только 
    один метод operate. Он следует принципу разделения интерфейса, поскольку не содержит избыточных 
    или неиспользуемых методов.

4. Принцип инверсии зависимостей (Dependency Inversion Principle):

    Класс Calculator зависит от интерфейса ComplexOperation, а не от конкретных реализаций операций. 
    Это соблюдает принцип инверсии зависимостей, так как он зависит от абстракции, а не от конкретики.

5. Принцип единственной ответственности (Single Responsibility Principle):

    Класс DivideOperation выполняет операцию деления комплексных чисел. Он отвечает только за это действие, 
    что соответствует принципу единственной ответственности.

6. Принцип открытости/закрытости (Open/Closed Principle):

    Класс MultiplyOperation также следует этому принципу, поскольку он представляет операцию умножения 
    и легко расширяется новыми видами операций без изменения существующего кода.

7. Принцип единственной ответственности (Single Responsibility Principle):

    Класс SubtractOperation реализует операцию вычитания комплексных чисел. 
    Он отвечает только за это действие, что соответствует принципу единственной ответственности

8. Принцип открытости/закрытости (Open/Closed Principle):

    Класс ViewCalculator можно считать закрытым для изменений, так как он выполняет свою основную функцию 
    (ввод чисел и операций над ними) без необходимости внесения изменений в код самого класса.

9. Принцип подстановки Барбары Лисков (Liskov Substitution Principle):

    Классы операций имеют общий интерфейс ComplexOperation, что позволяет использовать их взаимозаменяемо.

