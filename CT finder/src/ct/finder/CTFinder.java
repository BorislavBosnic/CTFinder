/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct.finder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP BOOK
 */
public class CTFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> highscore = new ArrayList<>();
        ArrayList<String> CTs = new ArrayList<>();

        
        
        try(BufferedReader br = new BufferedReader(new FileReader(new File("highscore.txt")))){
            String linija = "";
            String split[];
            while((linija=br.readLine())!=null){
                split=linija.split("\\t");
                String split2[] = split[1].split(" ");
                
               // System.out.println(split2[split2.length-1]);
                highscore.add(split2[split2.length-1]);
            
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
        try(BufferedReader br = new BufferedReader(new FileReader(new File("myCTs.txt")))){
            String linija = "";
            String split[];
            while((linija=br.readLine())!=null){
                split=linija.split("\\t");
                String split2[] = split[0].split(" ");
                
              //  System.out.println(split2[split2.length-1]);
               CTs.add(split2[split2.length-1]);
            
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
        //for(int i = 0; i< CTs.size(); i++){
            for (int j = 0; j<highscore.size(); j++){
            if(!CTs.contains(highscore.get(j)))
                System.out.println(highscore.get(j));
                
        }
        
        }
        // TODO code application logic here
    }
    

