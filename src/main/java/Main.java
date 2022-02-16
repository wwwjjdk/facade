public class Main {
    public static void main(String[] args) {

        String a ="11";
        String b ="10";
        BinOps binOps = new BinOps();
        System.out.printf("Операция сложения: %s\nОперация умножения: %s", binOps.sum(a,b),binOps.mult(a,b));
    }
}
