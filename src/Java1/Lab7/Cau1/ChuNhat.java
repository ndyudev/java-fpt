package Java1.Lab7.Cau1;

public class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return ( dai + rong ) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chu Vi: " + getChuVi() + "\nDien tich: " + getDienTich() );
    }
}
