
public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person akira = new Person();
		akira.name="幡野彬";
		akira.age=24;
		System.out.println(akira.name);
		System.out.println(akira.age);
		akira.phoneNumber="080-XXXX-XXXX";
		akira.address="XX県XX市XX-XX-XX";
		System.out.println(akira.phoneNumber);
		System.out.println(akira.address);




		Robot aibo = new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name="doraemon";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();




	}

}
