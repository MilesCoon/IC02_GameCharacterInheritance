public class Main {
    public static void main(String[] args) {
        GameCharacter tallTree = new GameCharacter("Tall Tree", 1);
        GameCharacter me = new Hero("Mage Miles", 5);
        GameCharacter monster = new Villain("Monster", 1);

        System.out.println("\n~~~Game Characters Created~~~");
        System.out.println(tallTree);
        System.out.println(me);
        System.out.println(monster);

        System.out.println("\n~~~The monster has been attacked~~~");
        me.attack(monster);
        System.out.println(tallTree);
        System.out.println(me);
        System.out.println(monster);

        System.out.println("\n~~~The monster assists itself~~~");
        monster.assist(monster);
        System.out.println(tallTree);
        System.out.println(me);
        System.out.println(monster);

        System.out.println("\n~~~Everybody Rests~~~");
        tallTree.rest();
        me.rest();
        monster.rest();
        System.out.println(tallTree);
        System.out.println(me);
        System.out.println(monster);
    }
}