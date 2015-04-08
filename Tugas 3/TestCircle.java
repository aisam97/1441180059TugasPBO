class TestCircle{
public static void main(String[] args) {
		circle cahya = new circle();
		circle ardy = new circle(30);
		circle akbar = new circle(80, "Putih Tua");

		cahya.setColor("Pinkkk");

		System.out.println("Radius = "+ cahya.getRadius() +" Color = "+cahya.getColor()+" Luas = "+cahya.getArea());
		System.out.println("Radius = "+ ardy.getRadius() +" Color = "+ardy.getColor()+" Luas = "+ardy.getArea());
		System.out.println("Radius = "+ akbar.getRadius() +" Color = "+akbar.getColor()+" Luas = "+akbar.getArea());
		}
}