import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatNumber {
    public static void main(String args[]) {
        {
            Scanner console = new Scanner(System.in);
            String my_string = console.nextLine();

            List<String> list = new ArrayList<String>();
            list.add(my_string);

            Map<String, Long> result =
                    list.stream().collect(
                            Collectors.groupingBy(
                                    Function.identity(), Collectors.counting()
                            )
                    );

            System.out.println(result);
        }
        }

    }

