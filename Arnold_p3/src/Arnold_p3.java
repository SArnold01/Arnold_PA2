import java.util.Scanner;

public class Arnold_p3 {
       public static void main(String[] args) {
    	   
             Scanner scnr = new Scanner(System.in);
             
             //Initialize and declare variables
             String[] topics = {"Conservation", "Climate", "Energy Efficency", "Recycling", "Energy Production"};
                 
             int [][] rating = new int [topics.length][];         
             int numPeople;
             int topicRatings;
             int i;
             int a;
             
             //Set length for array
             for( i=0; i < rating.length; i++)
	             {
	                    rating[i] = new int[10];
	                    for( a = 0; a < rating[i].length; a++)
	                           rating[i][a] = 0;
	             }      
             
             //Get number of people for ratings
             System.out.println("How many people are participating?");
             numPeople = scnr.nextInt();
             
             //Loop rating question per person
             for( i = 0; i < numPeople; i++)
             {
                    System.out.println("\nGive a rating from 1-10 for each of the " + topics.length + " topics ");
                    for(a = 0; a < topics.length; a++)
                    {
                           System.out.println("Enter your rating for " + topics[a] + " : ");
                           topicRatings = scnr.nextInt();
                           
                           //If input is wrong sends user message
                           while(topicRatings < 1 || topicRatings > 10)
                           {
                                 System.out.println("Your input was invalid! Please use 1 - 10 for your rating!");
                                 System.out.println("Enter your rating for " + topics[a] + " : ");
                                 topicRatings = scnr.nextInt();
                           }                         
                           rating[a][topicRatings-1]++;
                    }
             }     
             
             //Create array for the average rating and rating of each
             int avgRating[] = new int[topics.length];
             String highestPointTopic = "" ; 
             String lowestPointTopic = "" ;
             int highestPointTotal = 0;
             int lowestPointTotal = 0;
             
             //Calculate statistics on ratings
             for(i = 0; i < rating.length; i++)
             {
                    avgRating[i] = 0;
                    for(a=0; a < rating[i].length; a++)
                           avgRating[i] += (rating[i][a] * (a + 1));    
                    
                    if(i == 0) // for first entry initialize the variables
                    {
                           highestPointTotal = avgRating[i];
                           lowestPointTotal= avgRating[i];
                           highestPointTopic= topics[i];
                           lowestPointTopic = topics[i];
                    }else
                    {
                           if(avgRating[i] > highestPointTotal)
                           {
                                 highestPointTopic = topics[i];
                                 highestPointTotal = avgRating[i];
                           }                        
                           if(avgRating[i] < lowestPointTotal)
                           {
                                 lowestPointTopic = topics[i];
                                 lowestPointTotal = avgRating[i];
                           }
                    }                   
                    avgRating[i] = avgRating[i] / numPeople;
             } 
             
             //Print statistics table
             System.out.printf("\n%-20s", "");
             
             for(i = 0; i < 10; i++)
                    System.out.printf("%-10d", (i + 1));
             System.out.printf("%20s", "Average");
             System.out.println();
             
             for(i=0; i < rating.length; i++)
             {
                    System.out.printf("\n%-20s", topics[i]);
                    
                    for(a = 0; a < rating[i].length; a++)
                           System.out.printf("%-10d",rating[i][a]);
                    System.out.printf("%20d",avgRating[i]);
             }          

             //Display the Highest and Lowest for each topic
             System.out.println("\n\nThe topic with the highest rating is "+ highestPointTopic +" with "+ highestPointTotal + " points.");
             System.out.println("The topic with the lowest rating is "+ lowestPointTopic +" with "+ lowestPointTotal + " points.");           
             
             //Close scanner
             scnr.close();          
       }
}