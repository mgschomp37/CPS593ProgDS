//Michael Schomp
//Programming and Data Structures Assignment 2

public class Statistician{

    private double minimum;
    private double maximum;
    private double sum;
    private int length;
    private double mean;



    public Statistician(){
        minimum = 0;
        maximum = 0;
        sum = 0;
        length = 0;
        mean = 0;
    }
    // adds the number to the data
    public void next(double num){
        
        if(length == 0){
            minimum = num;
            maximum = num;
            sum = num;
            length = 1;
        }
        else{
            if(num < minimum){
                minimum = num;
            }
            if(num > maximum){
                maximum = num;
            }
            sum = sum + num;
            
        }
        
    }

    
    //adds the data from the addend object to the current object
    public void addAll(Statistician addend){
      
        if(length == 0){
            minimum = addend.minimum;
            maximum = addend.maximum;
            sum = addend.sum;
            length = addend.length;
        }
        else{
            if(addend.minimum < minimum){
                minimum = addend.minimum;
            }
            if(addend.maximum > maximum){
                maximum = addend.maximum;
            }
            sum = sum + addend.sum;
            length = length + addend.length;
        }
    }
    // returns the length of the data
    public int length(){
        return length;
    }

    //returns the sum of the data
    public double sum(){
        return sum;
    }

    //returns the minimum value of the data
    public double minimum(){
        return minimum;
    }

    //returns the maximum value of the data
    public double maximum(){
        return maximum;
    }

    //calculates the mean of the data
    public double mean(){

        if (length == 0){
            mean = 0;
        }
        else{
            mean = sum/length;
        }
        return mean;
    }


    //combines two Statistician objects into one
    public static Statistician union(Statistician s1, Statistician s2){
        Statistician s3 = new Statistician();
        s3.length = s1.length + s2.length;
        s3.sum = s1.sum + s2.sum;
        s3.mean =- (s1.mean + s2.mean)/2;
        
        if(s1.minimum < s2.minimum){
            s3.minimum = s1.minimum;
        }
        else{
            s3.minimum = s2.minimum;
        }

        if(s1.maximum > s2.maximum){
            s3.maximum = s1.maximum;
        }
        else{
            s3.maximum = s2.maximum;
        }
    
        return s3;
    }


    //clears the data stored in the Statistician object
    public void clear(){
        minimum = 0;
        maximum = 0;
        mean = 0 ;
        sum = 0;
        length = 0; 
    }

    //equals method to compare the objects
    public boolean equals(Statistician s){
        if(minimum == s.minimum && maximum == s.maximum && mean == s.mean && sum == s.sum){
            return true;
        }
        else{
            return false;
        }
    }

    //toString method
    public String toString(){
        return "Minimum: " + minimum + " Maximum: " + maximum + " Mean: " + mean + " Sum: " + sum;
    } 




}