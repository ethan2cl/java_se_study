public class HelloWord {
    public static void main(String[] args) {
        HelloXhl helloXhl = new HelloXhl();
        helloXhl.hello();
        System.out.println("Hello World!");
    }
}

class HelloXhl {
    public void hello () {
        System.out.println("Hello xhl~");
    }
}