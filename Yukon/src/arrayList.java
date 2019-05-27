/* package whatever; // don't place package name! */
 
import java.io.*;
import java.util.Scanner;
import java.util.*;
 
 
class arrayList
{
   
   
    public void main (String[] args) throws java.lang.Exception
    {
        arrayListClass kek = new arrayListClass(makeArray());
        System.out.println(kek.doSelectionSort());
        // System.out.println(kek.sequentialSearch(5));
        // System.out.println(kek.binarySearch(55));  
    }
   
    public ArrayList<Integer> makeArray() {  
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> userArray = new ArrayList<Integer>();
        int total = 5;
        System.out.println("Please enter 5 numbers");
        do {
            int input = userInput.nextInt();
            userArray.add(input);
            total--;
        } while (total > 0);
        return userArray;
    }
}
 
 
 
class arrayListClass {
    public ArrayList<Integer> myArray = new ArrayList<Integer>();
   
    public arrayListClass(ArrayList<Integer> array) {
            this.myArray = array;
    }
   
    public void setArray(ArrayList<Integer> array) {
        this.myArray = array;
    }
   
   
    public int sequentialSearch(int x) {
        for(int i=0; i < this.myArray.size(); i++ ) {
            if (myArray.get(i) == x) {
                return i;
            }
        }
       
        return -1;
    }
   
   
    public int binarySearch(int x) {
        int lowEnd = 0;
        int highEnd = this.myArray.size() - 1;
        int middle = (highEnd + lowEnd) /2;
       
        while (lowEnd <= highEnd && this.myArray.get(middle) != x) {
            if (this.myArray.get(middle) < x) {
                lowEnd = middle + 1;
        }
        //while else? lol
            else if (this.myArray.get(middle) > x) {
            highEnd = middle - 1;
        }
           
       
         middle = (highEnd + lowEnd) / 2;
    }
       
        if (lowEnd > highEnd ){
            middle = -1;
        }
       
    return middle;
}
   
     public ArrayList<Integer> doSelectionSort(){
         
     
         
        for (int i = 0; i < this.myArray.size() ; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.myArray.size() ; j++)  
                if (this.myArray.get(j) < this.myArray.get(index))
                    index = j;
     
            int smallerNumber = this.myArray.get(index);
            this.myArray.set(index, this.myArray.get(i));
           
           
         
            this.myArray.set(i, smallerNumber);
 
        }
        return myArray;
 
}
   
}