package Part6;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoup1 {
    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://www.youzack.com/").get();//发出请求
        /*
        Element link = doc.getElementById("tucao");//使用唯一id查找元素

        String href = link.attr("href");//获取元素属性

        String text = link.text();//获取元素内部文本

        System.out.println(href+":"+text);
        System.out.println(text);
        Elements links=doc.getElementsByTag("a");
        for (Element a:links){
            System.out.println(a.attr("href")+","+a.text());
        }*/
        /*Elements elements= doc.getElementsByTag("img");
        for (Element img :elements){
            System.out.println(img.attr("src"));
        }*/
        /*Elements covers=doc.getElementsByClass("cover");
        for (Element text :covers){
            System.out.println(covers.text());
        }*/
        Document doc = Jsoup.connect("https://www.youzack.com/ListeningExercise/AlbumIndex/10/").get();

        Element div = doc.getElementsByClass("weui-cells").get(0);

        Elements links = div.getElementsByTag("a");//在class="weui-cells"的div内部查找所有的a标签

        for(Element link : links)
        {
        String text = link.text();
        String href=link.attr("href");
        System.out.println(text+":"+href);
        }
    }
}
