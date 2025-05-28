package impact;

import impact.modules.ModuleManager;

public class ImpactClient {
    public void start() {
        System.out.println("Impact Client started (simulation)");
        ModuleManager.initModules();
    }
}
