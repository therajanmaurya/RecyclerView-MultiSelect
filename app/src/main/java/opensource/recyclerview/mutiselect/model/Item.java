package opensource.recyclerview.mutiselect.model;

/**
 * Created by Rajan Maurya on 08/01/17.
 */

public class Item {

    String title;

    String subTitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }

    public Item(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }
}
