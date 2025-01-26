class RunLoop1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class RunLoop2 extends Thread{
    @Override
    public void run(){
        for (int i = 10; i < 15; i++) {
            System.out.println(i);
        }
    }
}


public class Demo{
    public static  void main(String[] args) {
    RunLoop1 st1 = new RunLoop1();
    RunLoop2 st2 = new RunLoop2();
    st1.start();
    st2.start();
    }
}
