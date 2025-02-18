package Java1.Lab7.Cau1;

public class Vuong extends ChuNhat{
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Hình vuông - Cạnh: " + dai);
        super.xuat();
    }
}
