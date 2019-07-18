/*

输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”
和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”

输入描述:
每个测试输入包含2个字符串


输出描述:
输出删除后的字符串
示例1
输入
They are students.
aeiou
输出
Thy r stdnts.
*/
package written_test0718;

import java.util.Scanner;
//删除公共字符
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            String str = in.nextLine();
            StringBuffer ss = new StringBuffer(s);
            for(int i =0;i<str.length();i++){
                char c = str.charAt(i);
                while(ss.indexOf(String.valueOf(c)) != -1){
                    ss.deleteCharAt(ss.indexOf(String.valueOf(c)));
                }
            }
            System.out.println(ss);
        }
    }
}