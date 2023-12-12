import java.util.ArrayList
import java.util.HashMap
public class HashMaptoArrayTest {
    public static void main(String[] args)
    {
        HashMap<String, Integer> topColleges = new HashMap<String, Integer>();
        topColleges.put("Georgia", 9.8); topColleges.put("Michigan", 9.4); topColleges.put("Ohio State", 9.7); topColleges.put("Notre Dame", 9.2); topColleges.put("Alabama", 9.6); topColleges.put("USC", 9.0); topColleges.put("Oklahoma", 9.0); topColleges.put("Texas", 9.3); topColleges.put("LSU", 9.5); topColleges.put("Clemson", 9.2);
        HashMap<String, Integer> greatColleges = new HashMap<String, Integer>();
        greatColleges.put("Oregon", 8.4); greatColleges.put("UW", 8.6); greatColleges.put("Tennessee", 8.7); greatColleges.put("Florida State", 8.4); greatColleges.put("Kentucky", 8.1); greatColleges.put("UNC", 8.0); greatColleges.put("Pitt", 8.4); greatColleges.put("TCU", 8.9); greatColleges.put("Iowa", 8.5); greatColleges.put("Tulane", 8.6);
        HashMap<String, Integer> goodColleges = new HashMap<String, Integer>();
        goodColleges.put("Ole Miss", 7.7); goodColleges.put("Purdue", 7.3); goodColleges.put("Air Force", 7.0); goodColleges.put("Syracuse", 7.2); goodColleges.put("Baylor", 7.8); goodColleges.put("Cincinnati", 7.9); goodColleges.put("Duke", 7.8); goodColleges.put("Kansas", 7.2); goodColleges.put("Arkansas", 7.4); goodColleges.put("Louisville", 7.8);
        HashMap<String, Integer> midColleges = new HashMap<String, Integer>();
        midColleges.put("Army", 6.1); midColleges.put("BYU", 6.9); midColleges.put("Vanderbilt", 6.8); midColleges.put("Stanford", 6.4); midColleges.put("Virginia", 6.2); midColleges.put("Wyoming", 6.0); midColleges.put("Colorado", 5.8); midColleges.put("Hawaii", 5.6); midColleges.put("UConn", 6.0); midColleges.put("Navy", 6.1);
        int count = (Math.random() * starRating) + 5;
        ArrayList<String> options = new ArrayList<String>();
        String[] topArray = topColleges.values().toArray();
        String[] greatArray = greatColleges.values().toArray();
        String[] goodArray = goodColleges.values().toArray();
        String[] midArray = midColleges.values().toArray();
        System.out.println(midArray);
    }
}

