package day12_转换流和缓冲流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
练习五:转换输出流的使用
描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
要求：使用gbk编码保存。
注意：idea的默认编码是utf-8,所以可以通过file?settings?file encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
    操作步骤:
        1.	创建文件字节输出流关联目标文件
        2.	根据文件字节输出流创建转换输出流对象，并指定编码字符集为：gbk
        3.	调用流对象的方法将字符串写出到文件中。
        4.	关闭流并释放资源。

 */
public class Test05_转换输出流的使用 {
    public static void main(String[] args) throws IOException {
        String content = "我爱java";
        FileOutputStream fos = new FileOutputStream("a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        osw.write(content);
        osw.close();
    }
}
