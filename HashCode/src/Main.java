import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 5; i < 10; i++) {
			list1.add(i);
			list2.add(i);
		}
		list1.add(1);
		System.out.println("Added 15 to list 1");
		System.out.println(list1.hashCode() + " == " + list2.hashCode() + " ? ");
		System.out.println("Added 15 to list 2");
		list2.add(1);
		Collections.sort(list1);
		Collections.sort(list2);
		if (list1.hashCode() == list2.hashCode()) {
			System.out.println("Hash codes are equal");
		} else {
			System.out.println("Dissimillar");
		}

		if (list1.equals(list2)) {
			System.out.println(".equals is true");
		} else {
			System.out.println(".equals is false");
		}

		if (list1 == list2) {
			System.out.println("== is true");
		} else {
			System.out.println("== is false");
		}
	}

}
