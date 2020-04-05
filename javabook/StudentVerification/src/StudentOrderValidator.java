public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = chekCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studAnswer = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister chekCityRegister(StudentOrder so){
        System.out.println("SityRegister запущен");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        System.out.println("CheckWedding запущен");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("CheckChildren запущен");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("CheckStudent запущен");
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }

    static void sendMail(StudentOrder so){

    }
}
