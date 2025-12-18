package AdapterPattern;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator fridge;

    public RefrigeratorAdapter(Refrigerator fridge) {
        this.fridge = fridge;
    }

    @Override
    public void plugIn() {
        fridge.startCooling();
    }
}