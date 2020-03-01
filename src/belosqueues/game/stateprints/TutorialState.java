package belosqueues.game.stateprints;

public class TutorialState extends GameStatePrint {

    @Override
    public void print() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n#######################################\n")
                     .append("#=========== Tutorial Stage ==========#\n")
                     .append("#======= \\help for command list ======#\n")
                     .append("#######################################\n\n");

        System.out.println(stringBuilder);
    }
}
