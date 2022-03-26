package objects;

import java.io.IOException;

import utils.JacksonUtilis;

public class Products {

	private int id;
	private String name;

	public Products() {
	}

	// extracting data from product array
	public Products(int id) throws IOException {
		Products[] products = JacksonUtilis.deserializeJson("products.json", Products[].class);
		for (Products product : products) {
			if (product.getId() == id) {
				this.id = id;
				this.name = product.getName();
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}