package prototype;

public class Client1 {
    public static void main(String[] args) {
        PersonSerializable person = new PersonSerializable();
        person.setName("Zhangsan");

        PersonSerializable person1 = CloneUtils.clone(person);

        person1.setTags("游戏");
        person1.setTags("游戏1");
        person1.setName("wangwu");
        System.out.println(person.getName() + "\t" + person.getTags());
        System.out.println(person1.getName() + "\t" + person1.getTags());
    }
}
