package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class SMTest {

    public static void main(String[] args) {
        menu();
    }
    // 封装一个主菜单的方法
    public static void menu(){
        // 数组保存学生信息,类型使用Student类型
        ArrayList<Student> list=new ArrayList<>();
        StudentManager stu=new StudentManager();
        boolean flag=true;
        while (flag){
            // 系统主界面
            System.out.println("请选择操作:");
            System.out.println("***********************************");
            System.out.println("*             1  插入             *");
            System.out.println("*             2  查找             *");
            System.out.println("*             3  删除             *");
            System.out.println("*             4  修改             *");
            System.out.println("*             5  输出             *");
            System.out.println("*             6  退出             *");
            System.out.println("***********************************");
            // 序号选择
            int choice=new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    // 插入
                    stu.addStudent(list);
                    break;
                case 2:
                    // 查找
                    stu.findStudent(list);
                    break;
                case 3:
                    // 删除
                    stu.delStudent(list);
                    break;
                case 4:
                    // 修改
                    stu.changeStudent(list);
                    break;
                case 5:
                    // 输出
                    stu.outStudent(list);
                    break;
                case 6:
                    // 退出
                    flag=false;
                    System.out.println("程序退出成功");
                    break;
            }
        }
    }
}