package impact.modules;

public class ModuleManager {
    public static void initModules() {
        System.out.println("Modules initialized (AutoCrystal, ClickGUI)");
        new AutoCrystal().activate();
    }
}
