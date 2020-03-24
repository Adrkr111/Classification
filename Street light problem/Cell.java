import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
public class Cell{
             public static void main(String args[])
             throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Creating BufferedReader object
             HashSet<String> set=new HashSet<String>(); //Creating a Set object
             String s=br.readLine(); //Creating String obj
             s=s.replace("(",""); //(RP)Replacing Operations For Extracting Data from formated input.
             s=s.replace(")","");//(RP)
             String bf[]=s.split(","); //Creating an array of useful data.
             for(int i=0;i<bf.length;i+=2){    //To take pair of numbers into consideration.(Each pair corrsponds to a single streetlight having a starting and ending street number}  )
				 IntStream st=IntStream.range(Integer.parseInt(bf[i]),Integer.parseInt(bf[i+1]));//creating stream of numbers(generating all the streets numbers covered by each streetlight)
				 st.forEach((j)->{set.add(Integer.toString(j));});//only unique values are added to the set which are not encountered earlier(New streets numbers are added to set)
			 }
              System.out.println(""+set.size());//total number of streets lightup.
             }
             }
