package Hash_;

import java.util.ArrayList;
import java.util.List;

public class Homework01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        News new1 = new News("新闻一");
        News new2 = new News("新闻二");
        new1.setContent("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        new2.setContent("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        list.add(new1);
        list.add(new2);

        for (Object o : list) {
           News obj = (News) o ;
           if(obj.getContent().length() > 15){
               obj.setContent(obj.getContent().substring(0,15) + "...");
               System.out.println(obj);
           } else {
               System.out.println(obj);
           }
        }

    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return  title + "：" + content + "。";
    }
}