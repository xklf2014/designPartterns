package com.story.designpatterns.visitor.zen.v2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()){
            emp.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();

        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setName("zhangsan");
        zhangsan.setGender(Employee.MALE);
        zhangsan.setSalary(1800);
        zhangsan.setJob("程序员");
        empList.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setName("lisi");
        lisi.setGender(Employee.FEMALE);
        lisi.setSalary(1900);
        lisi.setJob("页面美工，审美素质太不流行了！");
        empList.add(lisi);

        Manager wangWu = new Manager();
        wangWu.setName("wangwu");
        wangWu.setGender(Employee.MALE);
        wangWu.setSalary(3000);
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        empList.add(wangWu);

        return empList;
    }
}
