import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class CareerSim
{
    private int starRating;
    private double skillRating = (Math.random() * 6) + 4;
    public static void main(String[] args)
    {
        // get input whether user wants to start the game or not
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to play NFL Career Simulator");
        String ans = s.nextLine();

        if (ans.equals("ans"))
        {
            highSchool();
            College();
        }

    }

    public void highSchool()
    {
        // calucate high school star rating
        int starRatingRandom = (int) (Math.random());
        if (starRatingRandom >= 0 && starRatingRandom < 0.10)
        {
            starRating = 1;
        }

        else if (starRatingRandom >= 0.10 && starRatingRandom < 0.20)
        {
            starRating = 2;
        }

        else if (starRatingRandom >= 0.20 && starRatingRandom < 0.50)
        {
            starRating = 3;
        }

        else if (starRatingRandom >= 0.50 && starRatingRandom < 0.80)
        {
            starRating = 4;
        }

        else 
        {
            starRating = 5;
        }

        System.out.println("You are a " + starRating + " star recruit.");
        
    }
    
    public void College()
    {
        /* This calculates the colleges who want you, while considering your high school star rating.
        Top Schools: Michigan, Notre Dame, Ohio State, Alabama, USC, Oklahoma, Texas, Georgia, LSU, Clemson
        Great Schools: Oregon, UW, Tennessee, Florida State, Kentucky, UNC, Pitt, TCU, Iowa, Tulane
        Good Schools: Ole Miss, Purdue, Air Force, Syracuse, Baylor, Cincinnati, Duke, Kansas, Arkansas, Louisville
        Mid Schools: Army, BYU, Vanderbilt, Stanford, Virginia, Wyoming, Colorado, Hawaii, UConn, Navy */ 
        HashMap<String, Integer> topColleges = new HashMap<String, Integer>();
        topColleges.put("Georgia", 9.8); topColleges.put("Michigan", 9.4); topColleges.put("Ohio State", 9.7); topColleges.put("Notre Dame", 9.2); topColleges.put("Alabama", 9.6); topColleges.put("USC", 9.0); topColleges.put("Oklahoma", 9.0); topColleges.put("Texas", 9.3); topColleges.put("LSU", 9.5); topColleges.put("Clemson", 9.2);
        HashMap<String, Integer> greatColleges = new HashMap<String, Integer>();
        greatColleges.put("Oregon", 8.4); greatColleges.put("UW", 8.6); greatColleges.put("Tennessee", 8.7); greatColleges.put("Florida State", 8.4); greatColleges.put("Kentucky", 8.1); greatColleges.put("UNC", 8.0); greatColleges.put("Pitt", 8.4); greatColleges.put("TCU", 8.9); greatColleges.put("Iowa", 8.5); greatColleges.put("Tulane", 8.6);
        HashMap<String, Integer> goodColleges = new HashMap<String, Integer>();
        goodColleges.put("Ole Miss", 7.7); goodColleges.put("Purdue", 7.3); goodColleges.put("Air Force", 7.0); goodColleges.put("Syracuse", 7.2); goodColleges.put("Baylor", 7.8); goodColleges.put("Cincinnati", 7.9); goodColleges.put("Duke", 7.8); goodColleges.put("Kansas", 7.2); goodColleges.put("Arkansas", 7.4); goodColleges.put("Louisville", 7.8);
        HashMap<String, Integer> midColleges = new HashMap<String, Integer>();
        midColleges.put("Army", (int) 6.1); midColleges.put("BYU", 6.9); midColleges.put("Vanderbilt", 6.8); midColleges.put("Stanford", 6.4); midColleges.put("Virginia", 6.2); midColleges.put("Wyoming", 6.0); midColleges.put("Colorado", 5.8); midColleges.put("Hawaii", 5.6); midColleges.put("UConn", 6.0); midColleges.put("Navy", 6.1);
        int count = (int) (Math.random() * starRating) + 5;
        ArrayList<String> options = new ArrayList<String>();
        String[] topArray = topColleges.values().toArray();
        String[] greatArray = greatColleges.values().toArray();
        String[] goodArray = goodColleges.values().toArray();
        String[] midArray = midColleges.values().toArray();
        
        
        // this calculates what schools you get into based on your starRating
        int collegeTier;
        int whichCollege;

        if (starRating == 5)
        {
            while (count > 0)
            {
                collegeTier = (int) (Math.random());
                whichCollege = (int) (Math.random() * 10);
                if (collegeTier >= 0 && collegeTier < .35)
                {
                    options.add(topArray[whichCollege]);
                }
                else if (collegeTier >= .35 && collegeTier < .80)
                {
                    options.add(greatArray[whichCollege]);
                }
                else if (collegeTier >= .80 && collegeTier < .95)
                {
                    options.add(goodArray[whichCollege]);
                }
                else {
                    options.add(midArray[whichCollege]);
                }

                count--;
            }
        }

        else if (starRating == 4)
        {
            while (count > 0)
            {
                collegeTier = (int) (Math.random());
                whichCollege = (int) (Math.random() * 10);
                if (collegeTier >= 0 && collegeTier < .20)
                {
                    options.add(topArray[whichCollege]);
                }
                else if (collegeTier >= .20 && collegeTier < .70)
                {
                    options.add(greatArray[whichCollege]);
                }
                else if (collegeTier >= .70 && collegeTier < .90)
                {
                    options.add(goodArray[whichCollege]);
                }
                else {
                    options.add(midArray[whichCollege]);
                }

                count--;
            }
        }

        else if (starRating == 3)
        {
            while (count > 0)
            {
                collegeTier = (int) (Math.random());
                whichCollege = (int) (Math.random() * 10);
                if (collegeTier >= 0 && collegeTier < .12)
                {
                    options.add(topArray[whichCollege]);
                }
                else if (collegeTier >= .12 && collegeTier < .35)
                {
                    options.add(greatArray[whichCollege]);
                }
                else if (collegeTier >= .35 && collegeTier < .80)
                {
                    options.add(goodArray[whichCollege]);
                }
                else {
                    options.add(midArray[whichCollege]);
                }

                count--;
            }
        }

        else if (starRating == 2)
        {
            while (count > 0)
            {
                collegeTier = (int) (Math.random());
                whichCollege = (int) (Math.random() * 10);
                if (collegeTier >= 0 && collegeTier < .05)
                {
                    options.add(topArray[whichCollege]);
                }
                else if (collegeTier >= .05 && collegeTier < .20)
                {
                    options.add(greatArray[whichCollege]);
                }
                else if (collegeTier >= .20 && collegeTier < .60)
                {
                    options.add(goodArray[whichCollege]);
                }
                else {
                    options.add(midArray[whichCollege]);
                }

                count--;
            }
        }
        else
        {
            while (count > 0)
            {
                collegeTier = (int) (Math.random());
                whichCollege = (int) (Math.random() * 10);
                if (collegeTier >= 0 && collegeTier < .01)
                {
                    options.add(topArray[whichCollege]);
                }
                else if (collegeTier >= .01 && collegeTier < .10)
                {
                    options.add(greatArray[whichCollege]);
                }
                else if (collegeTier >= .10 && collegeTier < .40)
                {
                    options.add(goodArray[whichCollege]);
                }
                else {
                    options.add(midArray[whichCollege]);
                }

                count--;
            }
        }

        // make user choose which college they want to commit to
        System.out.println("These are the colleges that are interested in you.");
        for (int i = 0; i < options.length(); i++)
        {
            System.out.print(options[i] + ", ");
        }

        boolean properCollege = false;
        while (!(properCollege))
        {
            System.out.println("Pick a college:");
            String college = s.nextLine();
    
            for (int i = 0; i < options.length(); i++)
            {
                if (options[i].equals(college))
                {
                    properCollege = true;
                    break;
                }
            }
            if (!(properCollege))
                System.out.println("Please select a college from the list provided above (case-sensitive)");
        }
        
        System.out.println("You have committed to " + college);
        
        // career in college

}
}