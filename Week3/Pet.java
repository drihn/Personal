public class pet {
    // pet objective
    String name;
    String type;
    float trustlevel;
    int petlevel;
    Boolean ishappy;

    //pet method
    public void petDialogue() {
        System.out.println("\nWhose these pokemon?: " + name +"\nPikachu" + type +"\nElcectric type: " + "\ntrustlevel: " + trustlevel + "\npetlevel: " + petlevel + "\nis happy?: " + true);
    }
    //pet constructor
    public pet(String petname, String pettype, float pettrustlevel, int petpetlevel, Boolean petishappy){
        name = petname;
        type = pettype;
        trustlevel = pettrustlevel;
        petlevel = petpetlevel;
        ishappy = petishappy;


    }




}

   
