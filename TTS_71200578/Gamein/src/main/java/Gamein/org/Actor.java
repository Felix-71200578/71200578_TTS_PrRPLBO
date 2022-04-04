package Gamein.org;

abstract class Actor {
    private float x_pos;
    private float y_pos;

    abstract void getInfo();

    public float getXpos() {
        return x_pos;
    }

    public void setXpos(float x_pos) {
        this.x_pos = x_pos;
    }

    public float getYpos() {
        return y_pos;
    }

    public void setYpos(float y_pos) {
        this.y_pos = y_pos;
    }
}
