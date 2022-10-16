package com.masai.problem_1;

import java.util.Comparator;

public class SalaryComp implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        // TODO Auto-generated method stub
        return e1.getSalary()>e2.getSalary()?+1:-1;
    }

}
