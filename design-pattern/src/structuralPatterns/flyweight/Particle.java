package structuralPatterns.flyweight;

public class Particle {
    private float x, y, velocityX, velocityY;
    private int lifespan;
    private ParticleType type;

    public Particle(float x, float y, float velocityX, float velocityY, int lifespan, ParticleType type) {
        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.lifespan = lifespan;
        this.type = type;
    }

    public void update() {
        x += velocityX;
        y += velocityY;
        lifespan--;
    }

    public void draw() {
        System.out.println("Drawing particle at (" + x + ", " + y + ") with texture: " + type.getTexture());
    }
}
