package demo;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.PrintWriter;

public class Hello {

    public static void main(String[] args) throws IOException {
        Page page = new Page("Mustache");
        MustacheFactory factory = new DefaultMustacheFactory("templates");

        Mustache mustache = factory.compile(factory.getReader("hello.html"), "hello");
        mustache.execute(new PrintWriter(System.out), page).flush();
    }

}

class Page {
    final String name;
    public Page(String name) {
        this.name = name;
    }
}
