
/*
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

public String reverse(String sentence);


输入描述:
将一个英文语句以单词为单位逆序排放。

输出描述:
得到逆序的句子

示例1
输入
I am a boy
输出
boy a am I
*/
package written_test0718;

import java.util.Scanner;
//句子逆序
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            String[] str = s.split(" ");
            for(int i = str.length -1;i>-1;i--){
                if(i == 0){
                    System.out.println(str[i]);
                }else{
                    System.out.print(str[i]+" ");
                }

            }
        }
    }
}
