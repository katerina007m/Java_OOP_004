
public class Main {
    public static void main(String[] args) {
       StudentController controller = new StudentController();
       controller.create("Иванов", "Андрей", "Владимирович");
       controller.create("Сидоров", "Петр", "Иванович");
       controller.create("Морозов", "Евгений", "Петрович");
       controller.create("Петров", "ИВан", "Алексеевич");
       controller.printStudentList();
       
    }
}