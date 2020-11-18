package uk.ac.cam.lxp20.supo1;

public class Vector2D {
    float x;
    float y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y =y;
    }

    Vector2D add(Vector2D other) {
        return new Vector2D(x + other.x,y + other.y);
    }

    float scalarProduct(Vector2D other) {
        return this.x * other.x + this.y * other.y;
    }

    Vector2D normalisedVector () {
        float magnitude = magnitude();
        return new Vector2D(x/magnitude, y/magnitude);
    }

    float magnitude () {
        return (float) Math.sqrt(x*x + y*y);
    }







}

