class UnderstandingGenerics {
// class that needs generics

  
/**
 * Why this is bad? Doesn't provide type safety. new Chooser(List<String> strings)
 */
  public class Chooser {
    private final Object[] choiceArray;
    public Chooser(Collection choices) {
    choiceArray = choices.toArray();
    }
  public Object choose() {
    Random rnd = ThreadLocalRandom.current();
    return choiceArray[rnd.nextInt(choiceArray.length)];
   }
  }
}
