public class SizeDoesMatter {
 
    public static void main(String[] args) {
        final List<Integer> elements = Arrays.asList(1, 2, 3);
 
        final List<Integer> listOfInts = new ArrayList<Integer>(elements);
        final Collection<Integer> collectionOfInts = new ArrayList<Integer>(elements);
 
        listOfInts.remove(0);
        collectionOfInts.remove(0);
 
        System.out.println(listOfInts.size() == collectionOfInts.size());
    }
}