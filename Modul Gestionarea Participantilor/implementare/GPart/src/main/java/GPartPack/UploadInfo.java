package GPartPack;

import java.util.ArrayList;

public class UploadInfo {

    private String description;
    private ArrayList<Author> authorArrayList;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addAuthor(Author author)
    {
        this.authorArrayList.add(author);
    }
}
