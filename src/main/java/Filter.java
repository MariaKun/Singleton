import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) <= treshold) {
                logger.log("Элемент " + source.get(i) + " не проходит");
            } else {
                result.add(source.get(i));
                logger.log("Элемент " + source.get(i) + " проходит");
            }
        }
        return result;
    }
}
