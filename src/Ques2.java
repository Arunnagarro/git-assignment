//Question No.-2 
//Write some long text in a file (any paragraph taken from internet).
//Read the content of file through Java I/O.
//Create a program to find the frequency of all words. (using collections)

import java.io.*;

import java.util.*;

public class Ques2 {

           public static void main(String args[]) throws IOException

           {

                      String path = "C:\\Users\\arun02\\eclipse-workspace\\JavaAssignment_Arun\\src\\text.txt";

               FileReader file = new FileReader(path);

              

               BufferedReader bufferedReader = new BufferedReader(file);

              

               ArrayList<String> arr = new ArrayList<String>();

               Map<String, Integer> a = new HashMap<String, Integer>();

               String line;

               while ((line = bufferedReader.readLine()) != null) {

                      String words[] = line.split(" ");

                      for(int i=0;i<words.length;i++)

                      {

                                 arr.add(words[i]);

                      }

               }

               for (String w : arr) {

            int count = Collections.frequency(arr, w);

            a.put(w, count);

        }

               for (String key : a.keySet()) {

            System.out.println(key + " = " + a.get(key));

        }
               bufferedReader.close();

           }

}
