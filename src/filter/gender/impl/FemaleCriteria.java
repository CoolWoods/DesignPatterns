package filter.gender.impl;

import filter.Person;
import filter.gender.GenderCriteria;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements GenderCriteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> tempPersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if ("female".equalsIgnoreCase(person.getGender())) {
                tempPersonList.add(person);
            }
        }
        return tempPersonList;
    }
}
