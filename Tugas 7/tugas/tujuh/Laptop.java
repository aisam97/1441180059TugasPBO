/**
 * Created by Muhammad Isam on 10/06/2015.
 */

package tugas.tujuh;

public class Laptop {


    private String tipeLaptop;
    private String OS;
    private String CPU;
    private String GPU;
    private String RAM;
    private Brand createdBy;

    public Laptop(String tipeLaptop, String OS, String CPU, String GPU, String RAM, Brand createdBy) {
        this.tipeLaptop = tipeLaptop;
        this.OS = OS;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.createdBy = createdBy;
    }

    public String getTipeLaptop() {
        return tipeLaptop;
    }
    public void setTipeLaptop(String tipeLaptop) {
        this.tipeLaptop = tipeLaptop;
    }
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public Brand getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Brand createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Laptop = " +
                "\nTipe Laptop = " + tipeLaptop +
                "\nOS = " + OS +
                "\nCPU= " + CPU +
                "\nGPU= " + GPU +
                "\nRAM= " + RAM +
                "\ncreatedBy =\n" + createdBy;
    }
}
