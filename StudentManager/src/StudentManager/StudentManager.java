package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

/*
（问题4）
管理所有Student，有一个Student类型的数组作为字段；
插入 、查找、删除、输出、退出等功能在该类中作为方法实现；
首先输出选择菜单，等待用户输入选项；然后根据选项执行相应操作.
*/

public class StudentManager implements StudentInterface {
    //插入
    public void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //数据在不超过20可输入
        //if (list.size()<3) { //(问题4）此处用3代替20，方便测试信息已满未改回去
        if (list.size()<20) {
            //（问题14）
            System.out.println("请输入学号：");
            int id = sc.nextInt();

            System.out.println("请输入姓名：");
            String name = sc.next();

            System.out.println("请输入生日：");
            String birDate = sc.next();

            System.out.println("请输入性别：");
            String gender = sc.next();

            list.add(new Student(id, name, birDate, gender));

            System.out.println("添加完成");
        }
        //数据超过20提示
        /*else{
            System.out.println("信息以满20，请勿再插入信息");
            //return;
        }*/
        //（问题18,19）
        else System.out.println("信息以满20，请勿再插入信息");
        }

    //查找
    public void findStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要查找的姓名：");
        String name=sc.next();
        //查找成功输出信息，否则提示
        /* （问题36）
            if (stu.getName().equals(name)) {
                System.out.println(stu.toString());
            }
            else {
                System.out.println("你输入的姓名不存在");
                return;
            }*/
        for (Student stu:list)
            if (!stu.getName().equals(name)) {
                System.out.println("你输入的姓名不存在");
                return;
            } else {
                System.out.println(stu.toString());
            }
    }

    //删除
    public void delStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        // 判断一下有没有信息
         //（问题36,56)
//         if (list.size()==0){
//            // 如果为0，则说明list中没有学生信息
//            System.out.println("没有学生信息");
//            return;
//        }
//        outStudent(list);
//        System.out.println("输入要删除的姓名：");
//        // 输入要删除的姓名
//        String name=sc.next();
//        // 判断要删除的name是否在list中，在就删除
//        for (int i=0;i<list.size();i++){
//            if (list.get(i).getName().equals(name)){
//
//                Object string = list.remove(i);
//                System.out.println("删除成功,你删除的是："+string);
//            }
//        }
        if (list.size() != 0) {
            outStudent(list);
            System.out.println("输入要删除的姓名：");
            // 输入要删除的姓名
            String name = sc.next();
            // 判断要删除的name是否在list中，在就删除
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name)) {

                    Object string = list.remove(i);
                    System.out.println("删除成功,你删除的是：" + string);
                }
            }
        }
        else {
            // 如果为0，则说明list中没有学生信息
            System.out.println("没有学生信息");
            //return;
        }
    }

    //修改
    public void changeStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        // 判断一下有没有信息
        if (list.size()==0){
            System.out.println("当前没有学生信息");
            return;// 直接终止当前语句，不执行下面的语句
        }
        System.out.println("输入要修改的姓名：");
        String name=sc.next();
        // 判断要修改的name是否在list中，在就修改
        //（问题60）boolean flag=false;// 如果boolean为false，那么说明没有在这个人
        for (int i=0;i<list.size();i++){
            if (list.get(i).getName().equals(name)) {
                // 如果存在，就输入新的
                System.out.println("输入新的学号：");
                int idNew = sc.nextInt();

                System.out.println("输入新的姓名：");
                String nameNew = sc.next();

                System.out.println("输入新的生日：");
                String birDateNew = sc.next();

                System.out.println("输入新的性别：");
                String genderNew = sc.next();

                list.set(i, new Student(idNew, nameNew, birDateNew, genderNew));

                System.out.println("修改成功");
                return;
            }
        }


        //if (!flag){
        //（问题32）!flag为true
            System.out.println("没有找到该学生");
       // }
    }
    //输出

    @Override
    public void outStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("没有学生信息");
        }
        // 查询全部学生信息
        for (Student student:list){
            System.out.println(student.toString());
            System.out.println("信息已展示");
        }
    }
}
