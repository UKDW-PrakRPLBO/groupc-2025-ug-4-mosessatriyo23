package org.example;

public class HDMI extends Colokan{

    public HDMI( int harga, double promisedBandwidth,String merk) {
        super(harga,promisedBandwidth,merk );
    }

    @Override
    public double getRealBandwidth(){
        int harganormal = 50000;
        int harga = super.getHarga();
        double ratio = harga / (double)harganormal > 1?1:harga / (double)harganormal;
        return super.getPromisedBandwidth() * ratio;
    }
}
