package resources;

public enum APIResource {

	getuserAPI("/users");

	
	private String resource;
	
	APIResource(String resource){
		
		this.resource=resource;
	}
	
	public String getResource(){
		return resource;
		
	}
	
}
