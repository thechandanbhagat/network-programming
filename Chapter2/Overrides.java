package Chapter2;

public class abc {
    public static void main(String[] args) {
        abc a = new abc();
        a.x = "Sunil";
        abc b = new abc();
        b.x = "Sunil";
        System.out.println("For a");
        System.out.println(a.toString());
        System.out.println(a.hashCode());

        System.out.println("\nFor b");
        System.out.println(b.toString());
        System.out.println(b.hashCode());

        System.out.println("\nEquals : " + a.equals(b));
    }

    public String x = "abc";

    @Override
    public String toString() {
        return x + " from abc class";
    }

    @Override
    public int hashCode() {
        return x.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        abc obj = (abc) o;
        return obj.x == this.x;
    }
}
