public class Exercise {
    public int sumOfInts(int arrayOfInts[]){
        if (arrayOfInts==null) return 0;
        int sum=0;
        for (int i: arrayOfInts)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
     Exercise ex =new Exercise();
     int result= ex.sumOfInts(new int[]{1,2,3,4});
        System.out.println(result);
    }
}
