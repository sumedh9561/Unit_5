package com.masai.problem_1;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Demo {

    public  Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){

        Set <Entry<Employee, String>> set =originalMap.entrySet();

        TreeMap<Employee, String> tm=new TreeMap<Employee, String>(new SalaryComp());

        for(Entry<Employee, String> s:set) {
            tm.put(s.getKey(), s.getValue());
        }
        //		System.out.println(tm);


        return tm;
    }

    public static void main(String[] args) {

        HashMap<Employee,String> hm=new HashMap<>();
        hm.put(new Employee(1, "E1",20000), "emp1");
        hm.put(new Employee(2, "E2",54000), "emp2");
        hm.put(new Employee(3, "E3",76000), "emp3");
        hm.put(new Employee(4, "E4",30000), "emp4");
        hm.put(new Employee(5, "E5",11000), "emp5");

        Demo d1=new Demo();

//		;
        Set <Entry<Employee, String>> set =d1.sortMapUsingEmployeeSalary(hm).entrySet();
        for(Map.Entry<Employee, String> l:set) {
            System.out.println(l);
        }
    }

}