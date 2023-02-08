class Calculation {
    RomeNum rome = new RomeNum();

    public int calculateArab(int num1, String znak, int num2) {
        int result = 0;

        switch (znak) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;

            case ("*"):
                result = num1 * num2;
                break;

            case ("/"):
                result = num1 / num2;
                break;
        }
        return result;
    }

    public String calculateRome(int num1, String znak, int num2) throws Exception {
        int result = 0;
        switch (znak) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;

            case ("*"):
                result = num1 * num2;
                break;

            case ("/"):
                result = num1 / num2;
                break;
        }
        if (result < 0) {
            throw new Exception("т.к. в римской системе нет отрицательных чисел");
        } else {
            int ostatok = result;
            StringBuilder stringBuilder = new StringBuilder();
            if (result <= 10 || result == 100) {
                return rome.getMap().get(result);
            } else {
                ostatok = result % 10;
                stringBuilder.append(rome.getMap().get(result - ostatok));

                if (ostatok > 0) {
                    stringBuilder.append(rome.getMap().get(ostatok));
                }
            }
            return stringBuilder.toString();
        }
    }
}