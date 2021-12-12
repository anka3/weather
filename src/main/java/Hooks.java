import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hooks {
        boolean checkSecond(String bracket) {

////            добавь сюда считывание из двух файлов
//            public static boolean readTokenizer(StreamTokenizer tokenizer) throws IOException {
//                BigDecimal bigsum = BigDecimal.ZERO;
//                while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
//                    if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
//                        bigsum = bigsum.add(new BigDecimal(tokenizer.nval));
//                    }
//                }
//                System.out.println("Сумма всех чисел в файле " + bigsum);
//
//                return true;
//            }
//        }


            List<String> lines = new ArrayList<>();
            Path file = Paths.get("/NumberList");
            Stream<String> lineStream = Files.lines(file, StandardCharsets.UTF_8).collect(Collectors.joining(System.lineSeparator()));

            Scanner console = new Scanner(System.in);
            String a = console.next();

            try(FileOutputStream hooks = new FileOutputStream("hooks.txt");
                FileOutputStream notHooks = new FileOutputStream("Nothooks.txt"))
            {
                char[] array = bracket.toCharArray();
            if(array.length %2!=0)return false;
                int d = 0;
            for(
                int i = 0;
                i<array.length;i++)

                {
                    d += array[i] == '(' ? 1 : -1;
                    if (d < 0) return false;
                    notHooks.write(a, 0, a.length);

                    else{hooks.write(a, 0, a.length};
                }
            }

            return true;
        catch(IOException ex){

                System.out.println(ex.getMessage());
               
            }
        }

        }
