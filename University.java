import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class University {

    public static void main(String[] args) {
        try {
            File csv = new File("C:/Users/karen/Downloads/全台大學列表.csv"); // CSV檔案

            BufferedReader br = new BufferedReader(new FileReader(csv));

            // 讀取直到最後一行
            ArrayList<String> universityList = new ArrayList<String>();
            String line = "";
            while ((line = br.readLine()) != null) {
                // 把一行資料分割成多個欄位
                StringTokenizer st = new StringTokenizer(line, ",");

                while (st.hasMoreTokens()) {
                    // 將csv資料放進ArrayList
                    universityList.add(st.nextToken());
                }
            }
            br.close();
            for(String u:universityList) {
            	System.out.print(u);
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            // 捕獲File物件生成時的異常
            e.printStackTrace();
        } catch (IOException e) {
            // 捕獲BufferedReader物件關閉時的異常
            e.printStackTrace();
        }
    }
}