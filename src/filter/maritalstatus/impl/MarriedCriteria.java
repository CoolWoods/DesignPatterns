package filter.maritalstatus.impl;

import filter.Person;
import filter.maritalstatus.MaritalStatusCriteria;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements MaritalStatusCriteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> tempPersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if ("married".equalsIgnoreCase(person.getMaritalStatus())) {
                tempPersonList.add(person);
            }
        }
        return tempPersonList;
    }
}
