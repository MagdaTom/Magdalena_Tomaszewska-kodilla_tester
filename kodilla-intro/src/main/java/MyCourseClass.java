public class MyCourseClass {
    enum KodillaCourse{
        JD,
        JDP,
        TA

    }

    public static void main(String[] args){
        KodillaCourse myCourse = KodillaCourse.TA;

        switch(myCourse){
            case JD:
                System.out.println("Java Developer");
                break;
            case JDP:
                System.out.println("Java Developer Plus");
                break;
            case TA:
                System.out.println("Tester Automat.");
                break;
        }
    }
}
