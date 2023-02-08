import java.util.TreeMap;

class RomeNum {
    public String toRome(String firstNum, String znak, String secondNum) throws Exception {
        Calculation calculation = new Calculation();
        if ((firstNum.chars().allMatch(Character::isDigit) && secondNum.chars().allMatch(Character::isLetter)) ||
                (secondNum.chars().allMatch(Character::isDigit) && firstNum.chars().allMatch(Character::isLetter))) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        } else {
            if (firstNum.chars().allMatch(Character::isDigit) && secondNum.chars().allMatch(Character::isDigit)) {
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                if (!(znak.equals("+") || znak.equals("-") || znak.equals("*") || znak.equals("/"))) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else {
                    return String.valueOf(calculation.calculateArab(num1, znak, num2));
                }
            } else {
                String str1 = String.valueOf(Inverse().get(firstNum));
                String str2 = String.valueOf(Inverse().get(secondNum));
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                if (!(znak.equals("+") || znak.equals("-") || znak.equals("/") || znak.equals("*"))) {
                    throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                } else {

                }
                return calculation.calculateRome(num1, znak, num2);
            }
        }
    }


    public TreeMap<Integer, String> getMap() {
        TreeMap<Integer, String> getMap = new <Integer, String>TreeMap();
        getMap.put(1, "I");
        getMap.put(2, "II");
        getMap.put(3, "III");
        getMap.put(4, "IV");
        getMap.put(5, "V");
        getMap.put(6, "VI");
        getMap.put(7, "VII");
        getMap.put(8, "VIII");
        getMap.put(9, "IX");
        getMap.put(10, "X");
        getMap.put(20, "XX");
        getMap.put(30, "XXX");
        getMap.put(40, "XL");
        getMap.put(50, "L");
        getMap.put(60, "LX");
        getMap.put(70, "LXX");
        getMap.put(80, "LXXX");
        getMap.put(90, "XC");
        getMap.put(100, "C");
        return getMap;
    }

    public TreeMap<String, Integer> Inverse() {
        TreeMap<String, Integer> Inverse = new <String, Integer>TreeMap();
        Inverse.put("I", 1);
        Inverse.put("II", 2);
        Inverse.put("III", 3);
        Inverse.put("IV", 4);
        Inverse.put("V", 5);
        Inverse.put("VI", 6);
        Inverse.put("VII", 7);
        Inverse.put("VIII", 8);
        Inverse.put("IX", 9);
        Inverse.put("X", 10);

        return Inverse;
    }

}



