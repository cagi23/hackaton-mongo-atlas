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
//        ServerApi serverApi = ServerApi.builder()
//                .version(ServerApiVersion.V1)
//                .build();
        
        
		MongoClient mongoClient = MongoClients.create(connectionString);
		MongoDatabase database = mongoClient.getDatabase("sample_mflix");
		MongoCollection<Document> collection = database.getCollection("comments");
		
		
		
		System.out.println(collection.countDocuments());
		
        /*
        Object serverApi;
		MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString)).
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("admin");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }*/
		
		
		
	}

}
