package hash;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetAddTester {

    private final static HashSet<Object> people = new LinkedHashSet();

    public static void testUp() {

        BigDecimal salary = new BigDecimal(2000);
        Human human_1 = new Human(27, "Vladyslav", "Zakharhevskyi", salary);
        human_1.setId("First");
        System.out.println("Hash First: " + human_1.toString());
        people.add(human_1);

        BigDecimal salary1 = new BigDecimal(15000);
        Human human_2 = new Human(68, "Alla", "Pygacheva", salary1);
        people.add(human_2);


        Human human_3= new Human(27, "Vladyslav", "Zakharhevskyi", salary);
        human_3.setId("Second");
        System.out.println("Hash Third: " + human_3.toString());

        people.add(human_3);


        System.out.println(people);
    }

}
