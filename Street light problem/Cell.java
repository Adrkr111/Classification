import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
public class Cell{
             public static void main(String args[])
             throws IOException{
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             HashSet<String> set=new HashSet<String>();
             String s=br.readLine();
             s=s.replace("(","");
             s=s.replace(")","");
             String bf[]=s.split(",");
             int []n=new int[bf.length];
             for(int i=0;i<bf.length;i+=2){
				 IntStream st=IntStream.range(Integer.parseInt(bf[i]),Integer.parseInt(bf[i+1]));
				 st.forEach((j)->{set.add(Integer.toString(j));});
			 }
              System.out.println(""+set.size());
             }
             }
