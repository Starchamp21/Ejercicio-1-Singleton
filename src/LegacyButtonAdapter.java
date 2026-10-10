public class LegacyButtonAdapter implements Button {
    private LegacyButton legacyButton;

    public LegacyButtonAdapter(LegacyButton legacyButton) {
        this.legacyButton = legacyButton;
    }

    @Override 
    public void onClick() {
        legacyButton.press();
    }
}