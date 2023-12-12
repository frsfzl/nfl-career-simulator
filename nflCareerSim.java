import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class nflCareerSim
{
    Scanner scan = new Scanner(System.in);
    Random r = new Random();
    int starRating;
    double skillRating = r.nextDouble(5) + 4.5; // You start with a skillRating of 4.5-9.5
    String yourCollege;
    double skillFloor = .1;
    double skillCeiling = .5;
    public static void main(String[] args) {
        nflCareerSim sim = new nflCareerSim();
        Scanner s = new Scanner(System.in);
        
        // Ask if player is ready to start the game
        System.out.println("\n\nWelcome to the NFL Career Simulator\n_________________________________________\n");
        System.out.print("Would you like to begin? (y/n): ");
        String ready = s.nextLine();

        if (ready.equals("y")) {
            sim.highSchool();
            sim.College();
        }
        else {
            System.out.println("\nCome play later!\n");
        }
        
        
    }

    public void highSchool()
    {
        // Calculate the player's star rating
        Scanner entScanner = new Scanner(System.in);
        
        double starRatingRandom = r.nextDouble(101);

        if (starRatingRandom >= 0 && starRatingRandom < 10)
        {
            starRating = 1;
        }
        else if (starRatingRandom >= 10 && starRatingRandom < 20)
        {
            starRating = 2;
        }
        else if (starRatingRandom >= 20 && starRatingRandom < 50)
        {
            starRating = 3;
        }

        else if (starRatingRandom >= 50 && starRatingRandom < 80)
        {
            starRating = 4;
        }

        else 
        {
            starRating = 5;
        }

        System.out.println("You are a " + starRating + " star recruit!");
        entScanner.nextLine();
    }

    public void College()
    {
        /* This calculates the colleges who want you, while considering your high school star rating.
        Top Schools: Michigan, Notre Dame, Ohio State, Alabama, USC, Oklahoma, Texas, Georgia, LSU, Clemson
        Great Schools: Oregon, UW, Tennessee, Florida State, Kentucky, UNC, Pitt, TCU, Iowa, Tulane
        Good Schools: Ole Miss, Purdue, Air Force, Syracuse, Baylor, Cincinnati, Duke, Kansas, Arkansas, Louisville
        Mid Schools: Army, BYU, Vanderbilt, Stanford, Virginia, Wyoming, Colorado, Hawaii, UConn, Navy */
        HashMap<String, Double> topColleges = new HashMap<>();
        topColleges.put("Georgia", 9.8); topColleges.put("Michigan", 9.4); topColleges.put("Ohio State", 9.7); topColleges.put("Notre Dame", 9.2); topColleges.put("Alabama", 9.6); topColleges.put("USC", 9.0); topColleges.put("Oklahoma", 9.0); topColleges.put("Texas", 9.3); topColleges.put("LSU", 9.5); topColleges.put("Clemson", 9.2);
        HashMap<String, Double> greatColleges = new HashMap<>();
        greatColleges.put("Oregon", 8.4); greatColleges.put("UW", 8.6); greatColleges.put("Tennessee", 8.7); greatColleges.put("Florida State", 8.4); greatColleges.put("Kentucky", 8.1); greatColleges.put("UNC", 8.0); greatColleges.put("Pitt", 8.4); greatColleges.put("TCU", 8.9); greatColleges.put("Iowa", 8.5); greatColleges.put("Tulane", 8.6);
        HashMap<String, Double> goodColleges = new HashMap<>();
        goodColleges.put("Ole Miss", 7.7); goodColleges.put("Purdue", 7.3); goodColleges.put("Air Force", 7.0); goodColleges.put("Syracuse", 7.2); goodColleges.put("Baylor", 7.8); goodColleges.put("Cincinnati", 7.9); goodColleges.put("Duke", 7.8); goodColleges.put("Kansas", 7.2); goodColleges.put("Arkansas", 7.4); goodColleges.put("Louisville", 7.8);
        HashMap<String, Double> midColleges = new HashMap<>();
        midColleges.put("Army", 6.1); midColleges.put("BYU", 6.9); midColleges.put("Vanderbilt", 6.8); midColleges.put("Stanford", 6.4); midColleges.put("Virginia", 6.2); midColleges.put("Wyoming", 6.0); midColleges.put("Colorado", 6.8); midColleges.put("Hawaii", 5.6); midColleges.put("UConn", 6.0); midColleges.put("Navy", 6.1);

        int count = r.nextInt(starRating) + 5;
        System.out.println("\nThere are " + count + " colleges interested in you. \nPick one out of the list below.\n");
        
        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> topArray = new ArrayList<>(topColleges.keySet());
        ArrayList<String> greatArray = new ArrayList<>(greatColleges.keySet());
        ArrayList<String> goodArray = new ArrayList<>(goodColleges.keySet());
        ArrayList<String> midArray = new ArrayList<>(midColleges.keySet());

        int collegeTier, whichCollege;

        // Creates your college options array while considering your starRating
        if (starRating == 5)
        {
            while (count > 0)
            {
                collegeTier = r.nextInt(100);
                whichCollege = r.nextInt(10);

                if (collegeTier >= 0 && collegeTier < 35)
                {
                    if (!options.contains(topArray.get(whichCollege))) { options.add(topArray.get(whichCollege)); }
                    else { count ++; }

                }
                else if (collegeTier >= 35 && collegeTier < 80)
                {
                    if (!options.contains(greatArray.get(whichCollege))) { options.add(greatArray.get(whichCollege)); }
                    else { count ++; }
                }
                else if (collegeTier >= 80 && collegeTier < 95)
                {
                    if (!options.contains(goodArray.get(whichCollege))) { options.add(goodArray.get(whichCollege)); }
                    else { count ++; }
                }
                else {
                    if (!options.contains(midArray.get(whichCollege))) { options.add(midArray.get(whichCollege)); }
                    else { count ++; }
                }
                
                count--;
            }
        }
        else if (starRating == 4)
        {
            while (count > 0)
            {
                collegeTier = r.nextInt(100);
                whichCollege = r.nextInt(10);

                if (collegeTier >= 0 && collegeTier < 20)
                {
                    if (!options.contains(topArray.get(whichCollege))) { options.add(topArray.get(whichCollege)); }
                    else { count ++; }

                }
                else if (collegeTier >= 20 && collegeTier < 70)
                {
                    if (!options.contains(greatArray.get(whichCollege))) { options.add(greatArray.get(whichCollege)); }
                    else { count ++; }
                }
                else if (collegeTier >= 70 && collegeTier < 90)
                {
                    if (!options.contains(goodArray.get(whichCollege))) { options.add(goodArray.get(whichCollege)); }
                    else { count ++; }
                }
                else {
                    if (!options.contains(midArray.get(whichCollege))) { options.add(midArray.get(whichCollege)); }
                    else { count ++; }
                }
                
                count--;
            }
        }
        else if (starRating == 3)
        {
            while (count > 0)
            {
                collegeTier = r.nextInt(100);
                whichCollege = r.nextInt(10);

                if (collegeTier >= 0 && collegeTier < 12)
                {
                    if (!options.contains(topArray.get(whichCollege))) { options.add(topArray.get(whichCollege)); }
                    else { count ++; }

                }
                else if (collegeTier >= 12 && collegeTier < 35)
                {
                    if (!options.contains(greatArray.get(whichCollege))) { options.add(greatArray.get(whichCollege)); }
                    else { count ++; }
                }
                else if (collegeTier >= 35 && collegeTier < 80)
                {
                    if (!options.contains(goodArray.get(whichCollege))) { options.add(goodArray.get(whichCollege)); }
                    else { count ++; }
                }
                else {
                    if (!options.contains(midArray.get(whichCollege))) { options.add(midArray.get(whichCollege)); }
                    else { count ++; }
                }
                
                count--;
            }
        }
        else if (starRating == 2)
        {
            while (count > 0)
            {
                collegeTier = r.nextInt(100);
                whichCollege = r.nextInt(10);

                if (collegeTier >= 0 && collegeTier < 5)
                {
                    if (!options.contains(topArray.get(whichCollege))) { options.add(topArray.get(whichCollege)); }
                    else { count ++; }

                }
                else if (collegeTier >= 5 && collegeTier < 20)
                {
                    if (!options.contains(greatArray.get(whichCollege))) { options.add(greatArray.get(whichCollege)); }
                    else { count ++; }
                }
                else if (collegeTier >= 20 && collegeTier < 60)
                {
                    if (!options.contains(goodArray.get(whichCollege))) { options.add(goodArray.get(whichCollege)); }
                    else { count ++; }
                }
                else {
                    if (!options.contains(midArray.get(whichCollege))) { options.add(midArray.get(whichCollege)); }
                    else { count ++; }
                }
                
                count--;
            }
        }
        else
        {
            while (count > 0)
            {
                collegeTier = r.nextInt(100);
                whichCollege = r.nextInt(10);

                if (collegeTier >= 0 && collegeTier < 1)
                {
                    if (!options.contains(topArray.get(whichCollege))) { options.add(topArray.get(whichCollege)); }
                    else { count ++; }

                }
                else if (collegeTier >= 1 && collegeTier < 10)
                {
                    if (!options.contains(greatArray.get(whichCollege))) { options.add(greatArray.get(whichCollege)); }
                    else { count ++; }
                }
                else if (collegeTier >= 10 && collegeTier < 45)
                {
                    if (!options.contains(goodArray.get(whichCollege))) { options.add(goodArray.get(whichCollege)); }
                    else { count ++; }
                }
                else {
                    if (!options.contains(midArray.get(whichCollege))) { options.add(midArray.get(whichCollege)); }
                    else { count ++; }
                }
                
                count--;
            }
        }

        // Print out your college options
        for (int i = 0; i < options.size(); i++)
        {
            if (i != options.size() - 1) { System.out.print(options.get(i) + ", "); }
            else { System.out.print(options.get(i) + ".\n"); }
            
        }

        System.out.print("\nWhat is the college you commit to? ");
        yourCollege = scan.nextLine();
        boolean incorrect = true;
        while (incorrect)
        {
        if (options.contains(yourCollege)) { 
            System.out.println("\nYou have committed to " + yourCollege + "!"); 
            incorrect = false;
            scan.nextLine();
        }
        else {
            System.out.println("\nPlease enter a college from the list.");
            yourCollege = scan.nextLine();
        }
        }

        // Calculate the player's chance of being a starter
        double statGrade = 0;
        double yearGrade = 0;
        double ydRandom;
        double tdRandom;
        double intRandom;
        int passingYards = 0;
        int touchdowns = 0;
        int interceptions = 0;
        boolean isStarter = false;
        double randomChance;
        int collegeYear = 1;
        int yearsPlaying = 1;
        double yearMultiplier;
        double collegeRating;
        boolean hasRedshirted = false;
        String redshirt = "";
        if (topColleges.containsKey(yourCollege)){ collegeRating = topColleges.get(yourCollege); }
        else if (greatColleges.containsKey(yourCollege)) { collegeRating = greatColleges.get(yourCollege); }
        else if (goodColleges.containsKey(yourCollege)) { collegeRating = goodColleges.get(yourCollege); }
        else { collegeRating = midColleges.get(yourCollege); }
        System.out.println(skillRating);
        while ((yearsPlaying <= 4)&&(hasRedshirted)||(yearsPlaying <= 4))
        {
            passingYards = 0;
            touchdowns = 0;
            interceptions = 0;

            System.out.println("\n__________________________\n\nYear " + collegeYear + "\n__________________________\n");
            
            randomChance = r.nextDouble(1);
            double chanceOfBeingStarter = (skillRating * 0.7 + collegeYear)/collegeRating;
            if (chanceOfBeingStarter > 1)
            {
                chanceOfBeingStarter = 1;
            }
            System.out.println("Your chance of being a starter is " + (int) (chanceOfBeingStarter*100) + "%");
            System.out.println(randomChance);
            scan.nextLine();
            if (hasRedshirted == false) {
                System.out.print("Would you like to redshirt Year " + collegeYear + ("? (y/n) "));
                redshirt = scan.nextLine();
            }

            if (redshirt.equals("y"))
            {
                hasRedshirted = true;
                System.out.println("You have redshirted Year " + collegeYear);
                yearsPlaying--;
                isStarter = false;
                redshirt = "n";
                statGrade -= 80;

            }
            else if (!redshirt.equals("y")||!(hasRedshirted)) {
                if (randomChance <= chanceOfBeingStarter)
                {
                    System.out.println("You are the starting quarterback!");
                    isStarter = true;
                }
                else
                {
                    System.out.println("You were not a starter in Year " + collegeYear + ".");
                    isStarter = false;
                }
            }

            scan.nextLine();

            if (isStarter && !redshirt.equals("y"))
            {
                ydRandom = r.nextDouble(.45) + 1.2;
                tdRandom = r.nextDouble(15) - 10;
                intRandom = r.nextDouble(.8) + .45;
                passingYards = (int) (Math.pow(skillRating, ydRandom) + skillRating)*100+yearsPlaying*100 + r.nextInt(100);
                touchdowns =  (int) (passingYards/100 + tdRandom);//(int) (Math.pow(skillRating, tdRandom) + skillRating + yearsPlaying);
                interceptions = (int) (Math.pow(20 - skillRating,intRandom));
                System.out.println("Year " + collegeYear + " Stats: \n" + passingYards + " passing yards\n" + touchdowns + " touchdowns" + "\n" + interceptions + " interceptions");
                scan.nextLine();

            }
            yearsPlaying++;
            collegeYear++;
            if (yearsPlaying == 1){ yearMultiplier = .7; }
            else if (yearsPlaying == 2){ yearMultiplier = .85; }
            else if (yearsPlaying == 3){ yearMultiplier = 1; }
            else { yearMultiplier = 1.2; }
            
            if (passingYards == 0) { statGrade += 80; } // In order to make it not as bad if you don't start a year
            
            statGrade += yearGrade *yearMultiplier;
            System.out.println(statGrade);

            skillRating += r.nextDouble(skillCeiling+skillFloor) - skillFloor;
            System.out.println(skillRating);

        }

        if (statGrade > 500)
        {
            nflCombine();
        }
        
        
    }
    public void nflCombine()
    {
        scan.nextLine();
        System.out.println("\n____________________________\nYou have been invited to the NFL Combine");

        
    }
    public String draftGrade()
    {
        // Calculates a player's draft grade by looking at their stats and team's win rate
        return "Your draft grade is ";
    }
}