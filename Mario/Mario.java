//Create our main class called Mario, remember one class per file
// It has ti have the same file name as the class name.
public class Mario{
    //Create on emain method for our progrram no matter how   many files we have,
    //we  can onlu jabe one main method per program.
    // This is the entry point of our program.
    public static void main(String[] args){
        // Display a title for our game sim to out user!
        System.out.println("Welcome to the Mushroom Kingdom!");

        //Create a new instance of NPSs to popualate the world
        NPC npcToad = new NPC("ToadTown",  "Toad");
        NPC npcPeach = new NPC("Mushroom Castle", "Peach");
        NPC npcRosalina = new NPC("The commet Obserbatory", "Rosalina");

        npcToad.displaylocation();
        npcRosalina.displaylocation();
        npcPeach.displaylocation();

        npcPeach.eat("pie");

        npcRosalina.sleep();

        npcToad.talk("What to go on an adventure!");

        //Display the locations of the NPCs
        System.out.println("Your quest as Mario is to visit everyone, here are thir last locations");
    }
}