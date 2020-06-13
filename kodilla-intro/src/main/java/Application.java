public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

        public void showAgeAndHeight() {
            if (this.name != null) {
                if (this.age > 30 && this.height > 160) {
                    System.out.println("User is older than 30 and higher then 160cm");
                } else {
                    System.out.println("User is younger than 30 or lower than 160cm");
                }
            }
        }
    public static void main(String[] args){

        Application userA = new Application ("Adam", 40.5, 178);
            userA.showAgeAndHeight();
        }
    }
