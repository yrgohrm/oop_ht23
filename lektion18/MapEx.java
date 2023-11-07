import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> addressBook = new HashMap<>();
        
        addressBook.put("Hans Ramberg", "Programmerargränd 2");
        addressBook.put("Elin Lahti", "Storgatan 12B");
        addressBook.put("James Smith", "Tellus Drive 27");
        
        String elinsAddress = addressBook.get("Elin Lahti");
        System.out.println(elinsAddress);

        for (Map.Entry<String, String> entry : addressBook.entrySet()) {
            System.out.println(entry.getKey() 
                               + " bor på " + entry.getValue());
        }

    }
}
