import java.util.*;
import java.util.stream.Collectors;

public class RepeatNumber {
    public static void main(String args[]) {
        {
            Scanner console = new Scanner(System.in);
            String my_string = console.nextLine();
            String[] my_array = {my_string};

            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if( (my_array[i].equals(my_array[j])) && (i != j) )
                    {
                        System.out.println("Пвторяющиеся элементы : "+my_array[j]);
                    }
                }
            }
        }

    }
}
