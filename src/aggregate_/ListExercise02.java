package aggregate_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义",59,"罗贯中"));
        list.add(new Book("水浒传",43,"施耐庵"));
        list.add(new Book("红楼梦",78,"曹雪芹"));

        sort(list);
        for (Object o : list) {
            System.out.println("o=" + o);
        }

    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }

        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t \t价格：" + price + " \t\t作者：" + author;
    }
}
