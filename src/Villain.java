public class Villain extends GameCharacter{
    public Villain(String name, int level) {
        super(name, level);
    }

    public void attack(GameCharacter other) {
        // Generate a roll between 0 and 9
        int roll = rng.nextInt(10);
        // Calculate damage by multiplying the random number by "this" character's
        // level.
        int damage = mLevel * roll;
        // Deduct the damage from the other character's health points. However, do not
        // allow health points to go below zero.

        // this = "me, attacker"
        // other = "other character being attacked"

        other.mHealthPoints -= damage;

        // Do not allow HPs to go below 0
        if (other.mHealthPoints < 0) {
            other.mHealthPoints = 0;
            other.perish();
        }
    }

    public void steal(GameCharacter other) {
        switch (rng.nextInt(5)) {
            case 0:
                mHealthPoints += mLevel * 5;
                other.mHealthPoints -= mLevel * 5;
                if (other.mHealthPoints <= 0)
                    other.perish();
                break;
            case 1:
                mMagic += mLevel * 5;
                other.mMagic -= mLevel * 5;
                break;
            case 2:
                mGold += mLevel * 5;
                other.mGold -= mLevel * 5;
                break;
            case 3:
                mLevel++;
                mGold += 100;
                mMagic += 100;
                mHealthPoints += 100;

                other.mLevel--;
                other.mGold -= 100;
                other.mMagic -= 100;
                other.mHealthPoints -= 100;

                if (other.mHealthPoints <= 0)
                    other.perish();
                break;
            case 4:
                mHealthPoints = mLevel * 100;
                other.mHealthPoints = other.mLevel * 100;
                break;
        }
    }

    public void rest()
    {
        System.out.println("Villains never rest! Are you kidding me? We have too many nefarious things to do!");
    }

    public void perish() {
        System.out.println("Humanity has been restored! The villain has been perished.");
    }
}
