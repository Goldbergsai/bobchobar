package pojoclasess;


	
	public class PlaceOrder {
	    private boolean isAdult;
	    private int id;
	    private int typeId;
	    private int quantity;
	    private String name;
	    private String email;
	    private String price;
	    private String date;

	    // Constructors, getters, and setters

	    // Default constructor
	    public PlaceOrder() {
	    }

	    // Parameterized constructor
	    public PlaceOrder(boolean isAdult, int id, int typeId, int quantity, String name, String email, String price, String date) {
	        this.isAdult = isAdult;
	        this.id = id;
	        this.typeId = typeId;
	        this.quantity = quantity;
	        this.name = name;
	        this.email = email;
	        this.price = price;
	        this.date = date;
	    }

	    // Getters and Setters

	    public boolean isAdult() {
	        return isAdult;
	    }

	    public void setAdult(boolean adult) {
	        isAdult = adult;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getTypeId() {
	        return typeId;
	    }

	    public void setTypeId(int typeId) {
	        this.typeId = typeId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPrice() {
	        return price;
	    }

	    public void setPrice(String price) {
	        this.price = price;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    // toString method for easy debugging
	    @Override
	    public String toString() {
	        return "PlaceOrder{" +
	                "isAdult=" + isAdult +
	                ", id=" + id +
	                ", typeId=" + typeId +
	                ", quantity=" + quantity +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", price='" + price + '\'' +
	                ", date='" + date + '\'' +
	                '}';
	    }
	}



