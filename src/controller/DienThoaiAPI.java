package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dienthoai")
public class DienThoaiAPI {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllDienThoai() {
		return "{'dienthoai':'sony'}";
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getDienThoaiById(int id) {
		return "{'dienthoai':'sony'}";
	}
}
