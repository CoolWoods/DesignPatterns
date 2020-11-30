package prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonSerializable implements Serializable {
    private String name;
    private List<String> tags = new ArrayList<String>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(String tag) {
        this.tags.add(tag);
    }

}
