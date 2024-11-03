public class RobotTest {
  public static void main(String[] args) {
  
    Robot sim = new Robot(24, 5);
        
    // Test simulate()
    System.out.println();
    for (int i=1; i <= 5; i++) {
      System.out.println("testing simulate() #" + i);
      System.out.println(sim.simulate(true));   
    } 

    // Test runSimulations()
    System.out.println("100 sims of distance=24, max attempts=5 -> " + sim.runSimulations(100));
  }
}