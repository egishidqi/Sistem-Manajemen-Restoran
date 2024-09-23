package model;

import model.mainCourse_model;
import model.drinks_model;
import model.desert_model;
import model.apetizer_model;
import java.util.*;

public class order_model extends customer_model {
    String nama;
    String nomor;
    String alamat;

    public order_model() {
        this.nama = super.nama;
        this.nomor = super.nomor;
        this.alamat = super.alamat;
    }
    
    public static String countFrequencies(String[] arr){
        int[] visitedArr = new int[arr.length];
        int visited = -1;
        for(int i=0; i < arr.length; i++){
            int count = 1;
            for(int j=i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visitedArr[j] = visited;
                }
            }
            if(visitedArr[i] != visited){
                visitedArr[i] = count;
            }
        }
        String text = "";
        for(int i=0; i < visitedArr.length; i++){
            if(visitedArr[i] != visited){
                text = text + arr[i] + " (x" + visitedArr[i] + ")\n";
            }
        }
        return text;
    }
    public int generateReceiptOrder(){
        Random rand = new Random();
        int receipt_order = rand.nextInt(1000000000);
        return receipt_order;
    }
}
