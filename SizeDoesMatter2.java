public class SizeDoesMatter2 {
 
    public static void main(String[] args) {
        final List integers = Arrays.asList(new Integer[]{1, 2, 3});
        final List ints = Arrays.asList(new int[]{1, 2, 3});
 
        System.out.println(ints.size() == integers.size());
    }
}