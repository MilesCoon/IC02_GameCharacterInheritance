import java.util.Random;

public class GameCharacter {

  // Fields = attributes, instance variables, properties or characteristics
  protected String mName;
  protected int mHealthPoints;
  protected int mLevel;
  protected int mMagic;
  protected int mGold;

  Random rng = new Random();

  // Constructor method = instantiates a new object (new GameCharacter)
  public GameCharacter(String name, int level) {
    mName = name;
    mLevel = level;
    mHealthPoints = mLevel * 100;
    mMagic = mLevel * 100;
    mGold = mLevel * 100;
  }

  // Second constructor with name only (start at level 1)
  public GameCharacter(String name) {
    this(name, 1);
  }

  // Getters and Setters
  // Getter = retrieves the value of a field
  public String getName() {
    return mName;
  }

  // Setter = modifies the value of a field
  public void setName(String newName) {
    mName = newName;
  }

  public void attack(GameCharacter other) {
    System.out.println(this.mName + " does not attack. I'm peaceful :)");
  }

  /*
   * Implement the assist(GameCharacter other) method, as follows: Generate a
   * random number from 0 to 4 If 0, other character receives (level * 5) health
   * points, while "this" character loses (level * 5) magic. If 1, other character
   * receives (level * 5) magic points, while "this" character loses (level * 5)
   * magic. If 2, other character receives (level * 5) gold, while "this"
   * character loses (level * 5) gold. If 3, other character's level increases by
   * 1 (add 100 to gold, health points and magic), while "this" character loses a
   * level (decrease 100 from gold, health points and magic). If 4, both
   * characters' health is restored to (level * 100)
   */

  public void assist(GameCharacter other) {
    System.out.println(this.mName + " cannot assist.");
  }

  // toString method = converts an object into a String for display
  @Override
  public String toString() {
    // Game Character{Name='Paladin Paulding', Level=5, Health Points=500, Gold=500,
    // Magic=500}
    return "Game Character{Name=" + mName + ", Level=" + mLevel + ", Health Points=" + mHealthPoints + ", Gold=" + mGold
        + ", Magic=" + mMagic + "}";

  }

  public void rest()
  {
    System.out.println(this.mName + " never rests!");
  }

  public void perish()
  {
    System.out.println(this.mName + " cannot perish.");
  }

}