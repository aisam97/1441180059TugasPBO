class TestCircle{
public static void main(String[] args) {
		circle cahya = new circle();
		circle ardy = new circle(30);
		circle akbar = new circle(80, "Putih Tua");

		System.out.println("Radius = "+ cahya.radius +" Color = "+cahya.color+" Luas = "+cahya.getArea());
		System.out.println("Radius = "+ ardy.radius +" Color = "+ardy.color+" Luas = "+ardy.getArea());
		System.out.println("Radius = "+ akbar.radius +" Color = "+akbar.color+" Luas = "+akbar.getArea());

		}
}