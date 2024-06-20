package structuralPatterns.flyweight;

public class Main {
    public static void main(String[] args) {
        ParticleSystem system= new ParticleSystem();
        system.addParticle(0, 0, 1, 1, 60, "SmokeTexture", "Circle", "Gray");
        system.addParticle(10, 10, 2, 2, 60, "SmokeTexture", "Circle", "Gray");
        system.simulate();
    }
}
