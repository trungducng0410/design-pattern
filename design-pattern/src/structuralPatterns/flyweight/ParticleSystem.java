package structuralPatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ParticleSystem {
    private List<Particle> particles = new ArrayList<>();

    public void addParticle(float x, float y, float velocityX, float velocityY, int lifespan, String texture, String shape, String color) {
        ParticleType type = ParticleType.getParticleType(texture, shape, color);
        particles.add(new Particle(x, y, velocityX, velocityY, lifespan, type));
    }

    public void simulate() {
        for (Particle particle : particles) {
            particle.update();
            particle.draw();
        }
    }
}
