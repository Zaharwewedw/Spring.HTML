package web.Model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int nomer;
    private String marka;

    public Car() {

    }
    public Car(String model, int nomer, String marka) {
       this.model = model;
       this.nomer = nomer;
       this.marka = marka;
    }
    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "   model = " + model +
                "  nomer = " + nomer +
                "  marka = " + marka + "   ";
    }
}
