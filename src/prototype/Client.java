package prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("Zhangsan");

        Person person1 = person.clone();
        person1.setName("lisi");

        System.out.println(person + "\t" + person.getName());
        System.out.println(person1 + "\t" + person1.getName());

        person1.setTags("游戏");
        person1.setTags("游戏1");
        person1.setName("wangwu");
        System.out.println(person.getName() + "\t" + person.getTags());
        System.out.println(person1.getName() + "\t" + person1.getTags());
    }
}
