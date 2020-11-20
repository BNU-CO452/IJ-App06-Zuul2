public class Player
{
    private String name;
    private int score;
    private int count;

    public Player(String name)
    {
        this.name = name;
        score = 0;
        count = 0;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Player : " + name);
    }
}
