public class SimpleTextProvivder implements ITextProvider {
    private String string;

    public SimpleTextProvivder(String string) {
        this.string = string;
    }

    @Override
    public String getText() {
        return string;
    }
}
