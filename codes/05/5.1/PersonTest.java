public class PersonTest {
    public static void main(String[] args) {
        Person p;
        p = new Person();
        p.name = "小明";
        p.say("不想周一");
        System.out.println(p.name);
    }
}