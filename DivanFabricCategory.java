package HW_M12;

import java.util.Comparator;

public class DivanFabricCategory implements Comparator<Divan> {
    @Override
    public int compare(Divan d1, Divan d2) {
        return d1.getFabricCategory().compareTo(d2.getFabricCategory());
    }
}
