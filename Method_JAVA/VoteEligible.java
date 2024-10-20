public class VoteEligible {
    public static void Voting(int age)
    {
        if(age>=18)
        {
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }
    public static void main(String args[])
    {
        Voting(15);
        System.out.println("Which party");
        Voting(18);
    }
}
