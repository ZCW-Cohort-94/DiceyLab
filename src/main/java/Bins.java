import java.util.LinkedHashMap;

public class Bins {
    Dice die = new Dice(2);

    public LinkedHashMap<Integer , Integer> storage = new LinkedHashMap<>();


    public void setResultRange(Integer start, Integer end){
        for(int i = start; i <= end; i++){
            storage.putIfAbsent(i, 0);
        }
    }

    public void getResultRange(Integer start, Integer end){
        for(int i = start; i < end; i++){
            storage.get(i);
        }
    }
    public Integer getResultAtBin(Integer binNumber){
        return storage.get(binNumber);
    }

    public void incrementBinValue(Integer diceValue){
        if(storage.containsKey(diceValue)){
            storage.put(diceValue, (storage.get(diceValue) + 1));
        }
    }
}
