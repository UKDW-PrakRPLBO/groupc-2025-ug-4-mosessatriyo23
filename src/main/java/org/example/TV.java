package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public int getMaxResolusi() {
        return maxResolusi;
    }

    public void setMaxResolusi(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("TV dengan colokan merk "+ colokan.getMerk());
    }

    public int getResolution() {
        double res = 0.0;
        if (colokan.getRealBandwidth() >= 10 && colokan.getRealBandwidth() <= 35 ){
            res = 480;
        } else if (colokan.getRealBandwidth() > 35 && colokan.getRealBandwidth() <= 100) {
             res = 720;
        } else {
            res= 1080;
        }
        return Math.min((int) res, maxResolusi);
    }
}
