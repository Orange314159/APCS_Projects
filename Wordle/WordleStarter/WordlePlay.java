public class WordlePlay {

   public static void main(String[] args) {
      // instantiate a Wordle object
      Wordle word = new Wordle();

      // call the run() method of the Wordle object
      word.setSecretWord("debug");
      word.run();
   }

}