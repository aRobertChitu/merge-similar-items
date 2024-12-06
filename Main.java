//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    
    
    public static void main(String[] args) {

    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        Map<Integer, Integer> map = new TreeMap<>();


        for(int[] array : items1){
            if(!map.containsKey(array[0])){
                map.put(array[0], array[1]);
            }else{
                map.put(array[0], (map.get(array[0]) + array[1]));
            }
        }
        for(int[] array : items2){
            if(!map.containsKey(array[0])){
                map.put(array[0], array[1]);
            }else{
                map.put(array[0], (map.get(array[0]) + array[1]));
            }
        }

        List<List<Integer>> response = new ArrayList<>();
        for(Map.Entry<Integer, Integer>  entry : map.entrySet()){
            response.add(List.of(entry.getKey(), entry.getValue()));
        }

        return response;
    }


}