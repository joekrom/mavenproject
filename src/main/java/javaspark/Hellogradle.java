package javaspark;

import static spark.Spark.*;

public class Hellogradle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get("/hello", (req, res) -> "Hello world: microapp with maven complete");

	}

}
