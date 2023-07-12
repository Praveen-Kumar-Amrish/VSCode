import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String ipAdd = "UD";
        String[] arr = ipAdd.split("");
        List<String> list = Arrays.asList(arr);
        HashMap<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
       
    }
}
