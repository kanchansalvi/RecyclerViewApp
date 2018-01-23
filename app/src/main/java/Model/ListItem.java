package Model;

/**
 * Created by Ganesh-Salvi on 12/12/2017.
 */

public class ListItem {

    private String name;
    private String description;

    public ListItem(String name, String description) {
        this.name =name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
