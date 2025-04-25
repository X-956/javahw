interface Student{
    void lessonname();
    default void study(String somebody){
        System.out.print(somebody+"学习：");
        lessonname();
    }
}
//类实现接口
class JNUstudent implements Student {
    @Override
    public void lessonname(){
        System.out.print("高等数学");
    }
}
//Lambda表达式
public class Main {
    public static void main(String[] args) {
        Student iotstudent = ()-> System.out.println("物联网导论");
        Student fsstudent = ()-> System.out.println("食品微生物学");
        Student dsstudent = ()-> {
            System.out.print("设计学。");
            System.out.println("学设计不如学物联网");
        };
        iotstudent.study("LKY");
        fsstudent.study("A");
        dsstudent.study("B");
        JNUstudent jstudent = new JNUstudent();
        jstudent.study("C");
    }
}