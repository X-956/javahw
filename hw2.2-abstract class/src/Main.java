public class Main {
    public static void main(String[] args) {
        IOTstudent lky=new IOTstudent("lky");
        lky.study();
    }
}

abstract class JNUstudent {
    String name;
    JNUstudent(String name) {
        this.name = name;
    }

    abstract void lesson ();

    public void study(){
        System.out.print(name+" 学习：");
        lesson();
    }
}

class IOTstudent extends JNUstudent {
    public IOTstudent(String name) {
        super("物联网工程学院的学生"+name);
    }
    @Override
    public void lesson(){
        System.out.println("物联网导论，面向对象程序设计");
    }
}

class DESIGNstudent extends JNUstudent {
    public DESIGNstudent(String name) {
        super("设计学院的学生"+name);
    }
    @Override
    public void lesson(){
        System.out.println("产品设计");
    }
}

class FOODstudent extends JNUstudent {
    public FOODstudent(String name){
        super("食品学院的学生"+name);
    }
    @Override
    public void lesson(){
        System.out.println("食品化学");
    }
}