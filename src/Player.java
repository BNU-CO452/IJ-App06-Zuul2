public class Player
{
    private String name;
    private int score;
    private int count;

    /**
     * Added another comment
     * @param name
     */
    public Player(String name)
    {
        this.name = name;
        score = 0;
        count = 10;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Player : " + name);
    }
}
