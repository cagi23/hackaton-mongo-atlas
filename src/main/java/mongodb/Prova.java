package mongodb;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Prova {

	public static void main(String[] args) {
		
		String connectionString = "mongodb+srv://cagisw:cagisw@hackatoncluster.do1650g.mongodb.net/?retryWrites=true&w=majority";
		MongoClient mongoClient = MongoClients.create(connectionString);
		MongoDatabase database = mongoClient.getDatabase("sample_mflix");
		MongoCollection<Document> collection = database.getCollection("comments");
		
		
		System.out.println(collection.countDocuments());
		
		
		// database.createCollection("sampleCollection");
	}

}
