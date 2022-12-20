import java.util.*;
import java.util.stream.Collectors;

public class RoseService implements FloverService <Rose> {

    private List<Rose> roses;

    @Override
    public String addFlowers(List<Rose> t) {

        return ""+t;
    }

    @Override
    public List<Rose> getAllFlowers(List<Rose>roses) {
     List<Rose>roses1=new ArrayList<>();
        for (Rose r:roses) {
            roses1.add(r);
        }
        return roses1;

    }

    @Override
    public List<Rose> getFlowersFinByColor(List<Rose>roses, String colour) {
        LinkedList<Rose>roses1=new LinkedList<>();
        for (Rose ro:roses) {
            if (ro.getColour().equals(colour)){
                roses1.add(ro);
            }
        }
        return roses1;
    }

    @Override
    public Map<String, List<Rose>> groupingFlowersByColor(List<Rose>roses) {
        Map<String,List<Rose>>grouping=roses.stream().collect(Collectors.groupingBy(Rose::getColour));
        return grouping;
    }

    @Override
    public int getSumAllFlowers(List<Rose>roses) {
        int sum = 0;
        for (Rose r:roses) {
            sum+=r.getPrice();

        }
        return sum;
    }

    @Override
    public List<Rose> getAllFlowersSortByPrice(List<Rose>roses) {//Ascending
        List<Rose>roses1=
        roses.stream().sorted(Comparator.comparing(Rose::getPrice)).toList();
        return roses1;
    }
    public List<Rose> getSortByPrice(List<Rose>roses){
        List<Rose>roses1=
        roses.stream().sorted(Comparator.comparing(Rose::getPrice).reversed()).toList();
        return roses1;
    }
}
