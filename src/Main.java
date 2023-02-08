import java.util.Scanner;

 class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        if (array.length > 3) {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            if (array.length < 2) {
                throw new Exception("т.к. строка не является математической операцией");
            } else {
                String firstNum = array[0];
                String secondNum = array[2];
                String znak = array[1];
                RomeNum rome = new RomeNum();
                rome.toRome(firstNum, znak, secondNum);

                System.out.println(rome.toRome(firstNum, znak, secondNum));
            }
        }
    }
}