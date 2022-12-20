import java.util.List;
import java.util.Map;

public interface FloverService <T>  {

    String addFlowers(List<T> t);
     List<T> getAllFlowers(List<Rose>roses);
     List<T> getFlowersFinByColor(List<Rose>roses, String color);
    Map<String, List<T>> groupingFlowersByColor(List<Rose>roses);
    int getSumAllFlowers(List<Rose>roses);
     List<T> getAllFlowersSortByPrice(List<Rose>roses);
}
