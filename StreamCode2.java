import java.util.List;

public class StreamCode2 {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intList.stream().filter(i -> i % 2 == 0).map(i -> i * i).forEach(System.out::println);
    }
}
