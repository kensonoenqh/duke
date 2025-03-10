public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public Deadline(String description, boolean isDone, String by) {
        super(description, isDone);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    /**
     * formats the Task into savable format
     * @return String that can be saved into a txt file
     */
    public String toFormattedString() {
        return "D~" + super.toFormattedString() + "~" + by;
    }

}