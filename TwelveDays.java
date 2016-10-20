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

	  // convert to switch
      if (choice == 12)
           thing = "Twelve drummers drumming";
      else if (choice == 11)
           thing = "Eleven pipers piping";
      else if (choice == 10)
           thing = "Ten lords a-leaping";
      else if (choice == 9)
           thing = "Nine ladies dancing";
      else if (choice == 8)
           thing = "Eight maids a-milking";
      else if (choice == 7)
           thing = "Seven swans a-swimming";
      else if (choice == 6)
           thing = "Six geese a-laying";
      else if (choice == 5)
           thing = "Five golden rings";
      else if (choice == 4)
           thing = "Four calling birds";
      else if (choice == 3)
           thing = "Three French hens";
      else if (choice == 2)
           thing = "Two turtle doves and";
      else if (choice == 1)
           thing = "A partridge in a pear tree";
      else
           thing = "Invalid choice";
	   
	  // This is ugly... let's also convert it to a switch... this is just a little trickier
      if(choice >= 4)
         suffix = "th";
      else
        if(choice == 3)
          suffix = "rd";
        else
          if(choice == 2)
            suffix = "nd";
          else
            suffix = "st";
		
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


