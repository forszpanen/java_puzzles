package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestListStream {
	public static void main(String[] aArgs) {
		List<String> list = new ArrayList<>();
		list.add("milk");
		list.add("bread");
		list.add("sausage");
		list = list.subList(0, 2);
		Stream<String> stream = list.stream();
		list.add("eggs, don't forget eggs!");
		stream.forEach(System.out::println);
	}
}