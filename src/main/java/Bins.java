public class Bins {
    int[] bin = new int[11];
    public int[] storingNumbers(Integer number){
        int num = number-2;
        bin[num]++;
        return bin;
    }
}


