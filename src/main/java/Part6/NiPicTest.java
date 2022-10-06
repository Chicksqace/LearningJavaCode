package Part6;

import com.yzk18.commons.IOHelpers;
import com.yzk18.net.HttpSender;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NiPicTest {
    public static void main(String[] args) throws IOException {
       Document indexDoc=Jsoup.connect("https://www.nipic.com/photo/renwu/nvxing/index.html").get();
       String sTotalPage=indexDoc.getElementsByClass("totalPage").get(0).text();
       int totalPage=Integer.parseInt(sTotalPage);
//        int totalPage=5;
//        System.out.println(sTotalPage);
        for (int PageInex=1;PageInex<=totalPage;PageInex++){
            System.out.println("第"+PageInex+"页");
            String pageUrl="https://www.nipic.com/photo/renwu/nvxing/index.html?page="+PageInex;
            Document document=Jsoup.connect(pageUrl).get();
            Elements imgs =document.getElementsByClass("new-search-result-box").get(0).getElementsByTag("img");
            for (Element img:imgs){
//                经分析发现，图片的真实路径在data-src属性下
                String imgSrc="https:"+img.attr("data-src");
                System.out.println(imgSrc);
                String fileName=getFuleName(imgSrc);
                byte[] bytes=new HttpSender().sendGetBytes(imgSrc);//图片文件是byte[]格式
                IOHelpers.writeAllBytes("D:/temp/爬虫/图片/"+fileName,bytes);
            }
        }
    }
//    取路径的最后一部分作为文件名
//    //pic1.ntimg.cn/pic/20210705/28770028_103149054123_4.jpg得到8770028_103149054123_4.jpg
    static String getFuleName(String url){
        String[] strs=url.split("/");
        return strs[strs.length-1];
    }
}
