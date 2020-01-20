package team.uptech.motionviews;

public enum  Helper {
    INSTANCE;
    private float ratio;

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }
}
