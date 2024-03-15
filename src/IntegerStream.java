import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {


        IntStream.range(20,40)
                .forEach(System.out::println);
// IntStream creates a stream of Integers ranging from 20 to 40

    }
}
