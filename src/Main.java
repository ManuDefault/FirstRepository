import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        ClassB b = new ClassB(1, 2);
        ClassB.ClassA a = b.new ClassA(3, 4);
        System.out.println(a);

        Function function = (e, c) -> {
            return c * e;
        };
        User.Adam adam = new User.Adam();
        adam.setValue("root\n", "root");
        adam.showInfo();
        //adam.showToInt(5, 5, function);
        String lorem = "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam quia nesciunt ab doloribus dicta, tenetur fugit ducimus impedit. Dicta eum, null praesentium dolor ipsum incidunt quibusdam ex repudiandae voluptatibus reprehenderit.";
        String[] strs = lorem.split(" ");
        char[] chars = {'a', 'o', 'u', 'i', 'e', 'y'};
        List<String> stringList = Arrays.stream(strs).toList();
        stringList.stream().forEach(System.out::println);
        List<String> stream = stringList.stream()
                .filter(e -> e.length() > 3)
                .map((e) -> {
                    String s1 = null;

                        for (int i = 0; i < chars.length; i++) {
                            if (e.contains(String.valueOf(chars[i]))) {
                                //System.out.println(s1);
                                s1 = e;
                            }
                        }
                    return s1;
                })
                .sorted((e, i) -> Integer.compare(e.length(), i.length()))
                .collect(Collectors.toList());
        System.out.println(stream);
    }
}
