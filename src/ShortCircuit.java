import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortCircuit {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(2,i->i*2);
        List<Integer> list = integerStream.skip(3).limit(5).collect(Collectors.toList());
        System.out.println(list);
    }
}
