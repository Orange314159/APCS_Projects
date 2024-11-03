public class Phrase{
   private String instrument;
   private String type;
   
   // const basic
   public Phrase() {
      instrument = "piano";
      int randominteger = (int) (Math.random()*2) + 1;
      if (randominteger > 1) {
         type = "trio";
      }
      else {
         type = "minuet";
      } 
   }
   
   // const w/ instrument 
   public Phrase(String inst) {
      if (inst.equals("piano") || inst.equals("clarinet") || inst.equals("flute-harp") || inst.equals("mbira")) {
         instrument = inst;
      }
      else {
         instrument = "invalid";
      }
      int randominteger = (int) (Math.random()*2) + 1;
      if (randominteger > 1) {
         type = "trio";
      }
      else {
         type = "minuet";
      }
   }
   
   // const all
   public Phrase(String inst, String typ) {
      if (inst.equals("piano") || inst.equals("clarinet") || inst.equals("flute-harp") || inst.equals("mbira")) {
         instrument = inst;
      }
      else {
         instrument = "invalid";
      }
      if (typ.equals("trio") || typ.equals("minuet")) {
         type = typ;
      }
      else {
         type = "invalid";
      }
   }
   
   // get stuff
   public String getInstrument() {
      return instrument;
   }
   
   public String getType() {
      return type;
   }
   
   // next rand phrase
   public int nextPhrase() {
      int rand1 = 0;
      int rand2 = 0;
      rand1 = (int) (Math.random() * 6) + 1;
      if (type.equals("minuet")){
         rand2 = (int) (Math.random() * 6) + 1;
      }  
      return rand1 + rand2;   
   }
   
   // play the phrase
   public String playPhrase(int i) {
      String fileToPlay;
      fileToPlay = instrument + "/" + type + i + "-" + nextPhrase() + ".wav";
      StdAudio.play(fileToPlay);
      return fileToPlay;
   }
   
   // i need str
   public String toString() {
      return instrument+"/"+type;
   }
}