package com.playwrightdemo;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "==================== Before the great back end migration ====================" );

        ArrayList<String> blogfolioRoutes = new ArrayList<String>();
        blogfolioRoutes.add("Home Page: ");
        blogfolioRoutes.add("About Me Page: ");
        blogfolioRoutes.add("Projects Page: ");
        blogfolioRoutes.add("Experience Page: ");
        blogfolioRoutes.add("Blog Page: ");
        

        ArrayList<String> lighthouseCats = new ArrayList<String>();
        lighthouseCats.add("Performance Overall: "); // 0
        lighthouseCats.add("Performance - Largest Contentful Paint: "); // 1
        lighthouseCats.add("Performance - Speed Index: "); // 2
        lighthouseCats.add("Accessibility: "); // 3
        lighthouseCats.add("Best Practices: "); // 4
        lighthouseCats.add("Search Engine Optimization: ");  // 5
        
        double catScoreOne, catScoreTwo, catScoreThree, catScoreAvg;
        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(0)+ "                                                 ||");
        catScoreOne = 80;
        catScoreTwo = 82;
        catScoreThree = 82;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 3.1;
        catScoreTwo = 3.1;
        catScoreThree = 3.1;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ catScoreAvg+" second(s)"
        + "      ||");
        catScoreOne = 1.4;
        catScoreTwo = 0.7;
        catScoreThree = 0.7;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " second(s)"
        + "                   ||");
        catScoreOne = 71;
        catScoreTwo = 71;
        catScoreThree = 71;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 89;
        catScoreTwo = 89;
        catScoreThree = 89;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 50;
        catScoreTwo = 50;
        catScoreThree = 50;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0
        + "                           ||");
        
        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(1)+ "                                             ||");
        catScoreOne = 84;
        catScoreTwo = 80;
        catScoreThree = 80;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ " second(s)                          ||");
        catScoreOne = 2.9;
        catScoreTwo = 2.9;
        catScoreThree = 2.9;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ catScoreAvg+" seconds"
        + "        ||");
        catScoreOne = 0.8;
        catScoreTwo = 0.7;
        catScoreThree = 0.8;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                             ||");
        catScoreOne = 90;
        catScoreTwo = 90;
        catScoreThree = 90;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 93;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        
        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(2)+ "                                             ||");
        catScoreOne = 84;
        catScoreTwo = 80;
        catScoreThree = 80;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 2.9;
        catScoreTwo = 2.9;
        catScoreThree = 2.9;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ catScoreAvg+" second(s)"
        + "      ||");
        catScoreOne = 0.8;
        catScoreTwo = 0.7;
        catScoreThree = 0.8;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " second(s)"
        + "                   ||");
        catScoreOne = 90;
        catScoreTwo = 90;
        catScoreThree = 90;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 93;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        

        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(3)+ "                                           ||");
        catScoreOne = 82;
        catScoreTwo = 81;
        catScoreThree = 82;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 2.3;
        catScoreTwo = 2.4;
        catScoreThree = 2.3;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ Math.round(catScoreAvg)*10.0/10.0 +" second(s)"
        + "      ||");
        catScoreOne = 0.9;
        catScoreTwo = 0.9;
        catScoreThree = 0.9;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " second(s)"
        + "                   ||");
        catScoreOne = 77;
        catScoreTwo = 77;
        catScoreThree = 77;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 93;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");

        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(4)+ "                                                 ||"); //blog
        catScoreOne = 82;
        catScoreTwo = 81;
        catScoreThree = 82;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 3.3;
        catScoreTwo = 3.4;
        catScoreThree = 3.3;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+Math.round(catScoreAvg)*10.0/10.0 +" second(s)"
        + "      ||");
        catScoreOne = 0.8;
        catScoreTwo = 0.8;
        catScoreThree = 0.8;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " second(s)"
        + "                   ||");
        catScoreOne =90;
        catScoreTwo = 90;
        catScoreThree = 77;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 93;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        System.out.println("=====================================================================");

    
    
    
        System.out.println( "==================== After the great back end migration ====================" );

        
        
        System.out.println("=====================================================================");
        //Home
        System.out.println("||     " + blogfolioRoutes.get(0)+ "                                                 ||");
        catScoreOne = 98;
        catScoreTwo = 97;
        catScoreThree = 98;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 0.7;
        catScoreTwo = 0.8;
        catScoreThree = 0.8;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ Math.round(catScoreAvg*10.0/10.0)+" second(s)"
        + "        ||");
        catScoreOne = 0.4;
        catScoreTwo = 0.4;
        catScoreThree = 0.4;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " second(s)"
        + "                   ||");
        catScoreOne = 100;
        catScoreTwo = 100;
        catScoreThree = 100;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 89;
        catScoreTwo = 89;
        catScoreThree = 89;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 58;
        catScoreTwo = 58;
        catScoreThree = 58;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0
        + "                           ||");
        
        System.out.println("=====================================================================");
        //About me
        System.out.println("||     " + blogfolioRoutes.get(1)+ "                                             ||");
        catScoreOne = 92;
        catScoreTwo = 92;
        catScoreThree = 99;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 0.6;
        catScoreTwo = 0.5;
        catScoreThree = 0.6;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ Math.round(catScoreAvg)*10.0/ 10.0+" seconds"
        + "        ||");
        catScoreOne = 0.6;
        catScoreTwo = 0.4;
        catScoreThree = 0.6;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + " second(s)                   ||");
        catScoreOne = 91;
        catScoreTwo = 91;
        catScoreThree =91;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 96;
        catScoreTwo = 96;
        catScoreThree = 96;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        
        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(2)+ "                                             ||");
        catScoreOne = 91;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 0.3;
        catScoreTwo = 0.7;
        catScoreThree = 0.7;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ Math.round(catScoreAvg)*10.0/ 10.0+" seconds"
        + "        ||");
        catScoreOne = 0.7;
        catScoreTwo = 0.3;
        catScoreThree = 0.7;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                             ||");
        catScoreOne = 87;
        catScoreTwo = 87;
        catScoreThree = 87;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 96;
        catScoreTwo = 100;
        catScoreThree = 96;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        

        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(3)+ "                                           ||");
        catScoreOne = 82;
        catScoreTwo = 81;
        catScoreThree = 82;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 2.3;
        catScoreTwo = 2.4;
        catScoreThree = 2.3;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+ Math.round(catScoreAvg)*10.0/10.0 +" seconds"
        + "        ||");
        catScoreOne = 0.9;
        catScoreTwo = 0.9;
        catScoreThree = 0.9;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " seconds"
        + "                     ||");
        catScoreOne = 77;
        catScoreTwo = 77;
        catScoreThree = 77;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 93;
        catScoreTwo = 93;
        catScoreThree = 93;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");

        System.out.println("=====================================================================");
        
        System.out.println("||     " + blogfolioRoutes.get(4)+ "                                                 ||"); //blog
        catScoreOne = 96;
        catScoreTwo = 99;
        catScoreThree = 96;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(0)+" "+ Math.round(catScoreAvg*10.0/10.0)+ "                                    ||");
        catScoreOne = 0.7;
        catScoreTwo = 0.7;
        catScoreThree = 0.6;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(1)+" "+Math.round(catScoreAvg)*10.0/10.0 +" seconds"
        + "        ||");
        catScoreOne = 0.7;
        catScoreTwo = 0.7;
        catScoreThree = 0.6;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(2)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 + " seconds"
        + "                     ||");
        catScoreOne =91;
        catScoreTwo = 91;
        catScoreThree = 96;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(3)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                        ||");
        catScoreOne = 96;
        catScoreTwo = 96;
        catScoreThree = 96;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(4)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                                       ||");
        catScoreOne = 54;
        catScoreTwo = 54;
        catScoreThree = 54;
        catScoreAvg = (catScoreOne + catScoreTwo + catScoreThree) / 3;
        System.out.println("||     " + lighthouseCats.get(5)+" "+ Math.round(catScoreAvg)*10.0/ 10.0 
        + "                           ||");
        System.out.println("=====================================================================");

    
    }
}
