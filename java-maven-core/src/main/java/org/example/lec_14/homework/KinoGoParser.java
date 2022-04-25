package org.example.lec_14.homework;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class KinoGoParser {
    private static Document getPage() throws IOException {

        Document page = Jsoup.connect(" https://www.kinogo.biz/ ")
                .userAgent(" Chrome/33.0 .1750.152 ").get();
        return page;
    }

    public static void main(String[] args) throws IOException {
        Document page = getPage();

        Elements tablKino = page.getElementsByAttributeValue("class", "zagolovki");

        System.out.println(tablKino);
        /* tablKino если респечатать, то получается не очень красиво.
        у tablKino можно вызвать метод tablKino.eachText();
        который вернет лист фильмов, т.е. текст, который находится между >название фильма<
        */
        
        /*
        Ваш проект скорее всего не компилируется, добавьте в любой из pom.xml зависимость
        
         <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.14.3</version>
        </dependency>
        */
    }
}
//пока добрался только до уровня <h2.../h2>:   ссылки имени и года....вечером продолжу
// .....тока чур не подсказывать самому хоцца докапаться))))
