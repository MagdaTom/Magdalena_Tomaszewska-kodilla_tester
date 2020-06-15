public class AdvCalcVersion2 {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result = a - b;
                break;
            case "DIV":
                result = a / b;
                break;
            case "MUL":
                result = a * b;
                break;
        }
        return result;
    }
}