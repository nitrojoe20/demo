// This program prints a line from that song you know
// Author: <Your name here>
// Date: <The date here>

import javax.swing.*;
public class TwelveDays
{
   public static void main (String args[]) 
   {
      int choice;
      String entry;
      double total = 0;
      double price;
	  String suffix;
	  String thing;
	  
	  // calls method to get user choice from static method below.  Nice!
      choice = getChoice();
      int choice2 = getChoice();

	  // convert to switch
      switch(choice){
      case 1:
          thing = "A partridge in a pear tree";
          break;
      case 12:
           thing = "Twelve drummers drumming";
           break;
      case 11:
           thing = "Eleven pipers piping";
           break;
      case 10:
           thing = "Ten lords a-leaping";
           break;
      case 9:
           thing = "Nine ladies dancing";
           break;
      case 8:
           thing = "Eight maids a-milking";
           break;
      case 7:
           thing = "Seven swans a-swimming";
           break;
      case 6:
           thing = "Six geese a-laying";
           break;
      case 5:
           thing = "Five golden rings";
           break;
      case 4:
           thing = "Four calling birds";
           break;
      case 3:
           thing = "Three French hens";
           break;
      case 2:
           thing = "Two turtle doves and";
           break;
      default:
           thing = "Invalid choice";
      }
	  // This is ugly... let's also convert it to a switch... this is just a little trickier
      
      switch(choice2){
      case 4:
         suffix = "th";
         break;
      case 3:
         suffix = "rd";
         break;
      case 2:
         suffix = "nd";
         break;
       default:
         suffix = "st";
      }
      
	  System.out.println("\nOn the " + choice + suffix +
          " day of Christmas\n" +
          "My true love gave to me" + thing);
   }
   
   // custom method to get user input with GUI. Returns their day choice.
   public static int getChoice()
   {
      int choice;
      String entry;
      entry = JOptionPane.showInputDialog(null, 
         "From what day do you\n" +
         "want to start the song\n" +
         "The Twelve Days of Christmas?");
      choice = Integer.parseInt(entry);
      return choice;
   }
}


