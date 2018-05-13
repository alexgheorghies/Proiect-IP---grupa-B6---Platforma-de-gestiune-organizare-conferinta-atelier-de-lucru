package GPartPack;

import java.awt.*;
import java.util.ArrayList;

public class Presentation {

    String title;
    TextArea content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TextArea getContent() {
        return content;
    }

    public void setContent(TextArea content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
}
