package structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight class
public class ParticleType {
    private static final Map<String, ParticleType> cache = new HashMap<>();
    private final String texture;
    private final String shape;
    private final String color;

    private ParticleType(String texture, String shape, String color) {
        this.texture = texture;
        this.shape = shape;
        this.color = color;
    }

    public static ParticleType getParticleType(String texture, String shape, String color) {
        String key = texture + shape + color;
        if (!cache.containsKey(key)) {
            cache.put(key, new ParticleType(texture, shape, color));
        }
        return cache.get(key);
    }

    public String getTexture() {
        return texture;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }
}
