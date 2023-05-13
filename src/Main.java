public class Main {
    public static void main(String[] args) {
	List<Phone> phones = new ArrayList<>();
        Collections.addAll(phones, new Phone(3000, "Nokia"), new Phone(7500, "Samsung"), new Phone(3500, "Nokia"), new Phone(6000, "Samsung"), new Phone(10000, "IPhone"), new Phone(11000, "Samsung"));
	//1
	List<Phone> samsungPhones = phones.stream().filter(p -> p.getModel() == "Samsung").collect(Collectors.toList());
	samsungPhones.forEach(p -> System.out.println(p.toString()));
	//2
	System.out.println("_______________\n");
	phones.stream().sorted().forEach(p -> System.out.println(p.toString()));
    }
}
