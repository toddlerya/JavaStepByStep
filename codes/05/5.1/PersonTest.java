public class PersonTest {
    public static void main(String[] args) {
        Person p;
        p = new Person();
        Person p1 = new Person();

        System.out.println("变量p的hashCode地址：" + p.hashCode());
        System.out.println("变量p的identityHashCode地址：" + System.identityHashCode(p));
        System.out.println("变量p1的hashCode地址：" + p1.hashCode());
        System.out.println("变量p1的identityHashCode地址：" + System.identityHashCode(p1));
        p.name = "小明";
        // p.say("不想周一");
        System.out.println("p.name的identityHashCode地址：" + System.identityHashCode(p.name));
        System.out.println("p.name的hashCode地址：" + p.name.hashCode());
        // System.out.println(p.name);
    }
}