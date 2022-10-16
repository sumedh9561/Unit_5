package com.masai.problem_2;

import java.util.ArrayList;
import java.util.HashMap;


public class Mobile {

    HashMap<String,ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model){

        if(mobiles.containsKey(company)){
            ArrayList<String> temList=mobiles.get(company);
            temList.add(model);
            mobiles.replace(company,temList);
        }
        else {
            ArrayList<String>temList=new ArrayList<>();
            temList.add(model);
            mobiles.put(company,temList);
        }
        return "Mobile added successfully";
    }

    public ArrayList<String>getModels(String company){
        ArrayList<String>tem = mobiles.get(company);
        if(mobiles.containsKey(company)) {

        }
        if(!tem.isEmpty()) {
            return tem;
        }
        return null;
    }
    public static void main(String[] args) {
        try {
            Mobile objMobile = new Mobile();
            System.out.println(objMobile.addMobile("apple","Iphone_13"));
            System.out.println(objMobile.addMobile("samsung","s10 plus"));
            System.out.println(objMobile.addMobile("nokia","N1"));
            System.out.println(objMobile.addMobile("motorola","G4 plus"));

            ArrayList<String>modeList = objMobile.getModels("apple");
            for(String s: modeList) {
                System.out.println(s);
            }




        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e);
        }

//		    objMobile.getModels("apple");


//		    Scanner inputScanner = new Scanner(System.in);
//		    String inTakenString = inputScanner.next();
    }



}


