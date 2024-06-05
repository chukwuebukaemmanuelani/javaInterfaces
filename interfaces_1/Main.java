package interface_1;

public class Main {
    public static void main(String[] args) {
        Computer hp250 = new Computer(new RAM(), new Processor(), new Storage());
        System.out.println(hp250);
    }
    
}
