import cn.itcast.method.ArrayTools;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = s.nextInt();
        int ss = s.nextInt();

        if(score >= 60){
            System.out.println("恭喜你，及格了！");
        }else{
            System.out.println("对不起，你不及格！");
        }*/
        int []arr={1,2,43,12,5};
        ArrayTools arrayTools = new ArrayTools();
        System.out.println(arrayTools.getMax(arr));

    }




}
