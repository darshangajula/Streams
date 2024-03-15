import java.util.Arrays;
import java.util.List;

public class MatchOperator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,5,6,8);
//        allMatch :- this operation checks if all the elements in the collection satisfies the given predicate
       boolean allMatchBy2 = numbers.stream().allMatch(i->i%2==0);
//       anyMatch  :- this operation checks if any one of the elements in the collection satisfies the given predicate
       boolean anyMatchBy2 = numbers.stream().anyMatch(i->i%2==0);
//       noneMatch  :- this operation checks if none of the elements in the collection satisfies the given predicate
       boolean noneMatchBy7 = numbers.stream().noneMatch(i->i%7==0);
    }
}
