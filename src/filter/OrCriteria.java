package filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstMeetCriteria = criteria.meetCriteria(personList);
        List<Person> otherMeetCriteria = otherCriteria.meetCriteria(personList);
        for (Person person : otherMeetCriteria) {
            if (!firstMeetCriteria.contains(person)) firstMeetCriteria.add(person);
        }
        return firstMeetCriteria;
    }
}
