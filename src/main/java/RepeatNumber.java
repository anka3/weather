import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatNumber {
    public static void main(String args[]) {
        {
            Scanner console = new Scanner(System.in);
            String my_string = console.nextLine();
            LinkedHashMap<Character, Integer> keyValue = new LinkedHashMap<Character, Integer>();
            for(int i=0; i<my_string.length(); i++){
                Integer number = keyValue.get(my_string.charAt(i)); // метод get вернет null, если буква недоступна по данному индексу
                if(number==null) // Если символ отсутствовал в строке
                    keyValue.put(my_string.charAt(i),1);
                else // Если символ присутствовал в строке
                    keyValue.put(my_string.charAt(i),number+1);
            }
            for(Character c : keyValue.keySet())
                System.out.println(c+":"+keyValue.get(c));

        }
        }
    }


//    пользователь вводит большую строку, надо вывести, количество символов в ней, статистику по повторяющимся символам. Типа
//        a:3
//        b:1
//        r:9
//Мы обозначем количество как значение а буквы как ключ