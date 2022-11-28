import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class task03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader fr = new InputStreamReader(new FileInputStream("HomeWork2/data.json"), "UTF8");
        String s = new String();
        char ch;
        while (fr.ready()) {
            ch = (char)fr.read();
            if (ch != '"' && ch != '{' && ch != '}' && ch != '[' && ch != ']') s += ch;    
        }
        fr.close();
        String[] text = s.split((",|:"));
        for (int i = 5; i <= text.length; i ++) {
            if (i % 6 == 0) {
                System.out.print("Студент " + text[i-5] + " получил " + text[i-3] +
                                    " по предмету " + text[i-1] + "." + '\n');
            }
        }
    }
}