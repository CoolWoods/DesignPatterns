package prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private ArrayList<String> tags = new ArrayList<String>();
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

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.tags = (ArrayList<String>) this.tags.clone();
        return person;
    }
}
