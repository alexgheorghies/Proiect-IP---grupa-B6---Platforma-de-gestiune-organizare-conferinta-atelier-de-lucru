package GPartPack.internal.PresentationPack;

import java.util.ArrayList;

public class UploadInfo {

    private String description;
    private ArrayList<Author> authorArrayList = new ArrayList<>();

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

    @Override
    public String toString() {
        return "UploadInfo{" +
                "description='" + description + '\'' +
                ", authorArrayList=" + authorArrayList +
                '}';
    }
}
