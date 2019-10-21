public class Test {

	public static void main(String[] args) {
		System.out.println(Collections.emptyList() == Collections.emptyList());
		System.out.println(Collections.emptyIterator() == Collections.emptyIterator());
		System.out.println(Spliterators.emptySpliterator() == Spliterators.emptySpliterator());
		System.out.println(Stream.empty() == Stream.empty());
	}

}