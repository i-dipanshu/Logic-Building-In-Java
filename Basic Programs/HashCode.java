public class HashCode {
    // compare two address - same for hashcode()
    static boolean compare(Integer a , Integer b){
        return a.equals(b);
    }
    static boolean hash(HashCode x, HashCode y){
        return x.hashCode() == y.hashCode();
    }
    // while == compares the references.
    public static void main(String[] args) {
        Integer a = new Integer(23);
        Integer b = new Integer(23);
        System.out.println(compare(a, b));

        HashCode x = new HashCode();
        HashCode y = new HashCode();
        System.out.println(hash(x, y));
    }
}
