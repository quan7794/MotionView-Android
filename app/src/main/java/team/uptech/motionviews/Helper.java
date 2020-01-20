package team.uptech.motionviews;

public enum  Helper {
    INSTANCE;
    private float ratio;
    private int backgroundId;

    public int getBackgroundId() {
        return R.drawable.background1;        //hardcode

//        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }
}
