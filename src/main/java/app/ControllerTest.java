package app;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.bson.BSONObject;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import model.adt.*;
import model.adt.ClothesDryerADT;
import model.util.Dataset;
import model.util.MergeSort;
import model.FindAppliance;

@RestController
public class ControllerTest {
		private static ApplianceADT[] app;

    @RequestMapping(value = "/users/{id}/find")
    public ApplianceReturn find(@PathVariable String id,@RequestParam(value="type", defaultValue="World") String type, @RequestParam(value="brand", defaultValue="World") String brand, @RequestParam(value="model", defaultValue="World") String model) {
    	
    	//String myshoe = FindArray.getArray("Dryer");
    	
    	Dataset.init();
    	
		switch(type) {
			case "AirConditioner":
				app = new AirConditionerADT[Dataset.getAirconditioners().size()];
				Dataset.getAirconditioners().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found1 = FindAppliance.find(app, brand, model);
				addMongo(id, found1, 9);
				return new ApplianceReturn(found1.getBRAND_NAME(), found1.getMMODEL_NUM_1() , type, ((AirConditionerADT)found1).getConsumption());
		
			case "Dryer":
				app = new ClothesDryerADT[Dataset.getDryers().size()];
				Dataset.getDryers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found2 = FindAppliance.find(app, brand, model);
				addMongo(id, found2, 2);
				return new ApplianceReturn(found2.getBRAND_NAME(), found2.getMMODEL_NUM_1() , type, ((ClothesDryerADT)found2).getConsumption());
				
			case "Cooktop":
				app = new CooktopADT[Dataset.getCooktops().size()];
				Dataset.getCooktops().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found3 = FindAppliance.find(app, brand, model);
				addMongo(id, found3, 6);
				return new ApplianceReturn(found3.getBRAND_NAME(), found3.getMMODEL_NUM_1() , type, ((CooktopADT)found3).getConsumption());
				
			case "Dishwasher":
				app = new DishwasherADT[Dataset.getDishwashers().size()];
				Dataset.getDishwashers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found4 = FindAppliance.find(app, brand, model);
				addMongo(id, found4, 7);
				return new ApplianceReturn(found4.getBRAND_NAME(), found4.getMMODEL_NUM_1() , type, ((DishwasherADT)found4).getConsumption());
			
			case "Freezer":
				app = new FreezerADT[Dataset.getFreezers().size()];
				Dataset.getFreezers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found5 = FindAppliance.find(app, brand, model);
				addMongo(id, found5, 4);
				return new ApplianceReturn(found5.getBRAND_NAME(), found5.getMMODEL_NUM_1() , type, ((FreezerADT)found5).getConsumption());
			
			case "Oven":
				app = new OvenADT[Dataset.getOvens().size()];
				Dataset.getOvens().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found6 = FindAppliance.find(app, brand, model);
				addMongo(id, found6, 5);
				return new ApplianceReturn(found6.getBRAND_NAME(), found6.getMMODEL_NUM_1() , type, ((OvenADT)found6).getConsumption());
			
			case "Range":
				app = new RangeADT[Dataset.getRanges().size()];
				Dataset.getRanges().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found7 = FindAppliance.find(app, brand, model);
				addMongo(id, found7, 8);
				return new ApplianceReturn(found7.getBRAND_NAME(), found7.getMMODEL_NUM_1() , type, ((RangeADT)found7).getConsumption());
			
			case "Refridgerator":
				app = new RefridgeratorADT[Dataset.getRefridgerators().size()];
				Dataset.getRefridgerators().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found8 = FindAppliance.find(app, brand, model);
				addMongo(id, found8, 0);
				return new ApplianceReturn(found8.getBRAND_NAME(), found8.getMMODEL_NUM_1() , type, ((RefridgeratorADT)found8).getConsumption());
			
			case "Washer":
				app = new WasherADT[Dataset.getWashers().size()];
				Dataset.getWashers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found9 = FindAppliance.find(app, brand, model);
				addMongo(id, found9, 1);
				return new ApplianceReturn(found9.getBRAND_NAME(), found9.getMMODEL_NUM_1() , type, ((WasherADT)found9).getConsumption());
			
			case "Washer-Dryer":
				app = new WasherDryerADT[Dataset.getWasherDryers().size()];
				Dataset.getWasherDryers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found10 = FindAppliance.find(app, brand, model);
				addMongo(id, found10, 3);
				return new ApplianceReturn(found10.getBRAND_NAME(), found10.getMMODEL_NUM_1() , type, ((WasherDryerADT)found10).getConsumption());
				
			default:
				return new ApplianceReturn(type, brand, model, "0");
		
		}
    	     
    }
    
    private void addMongo(String id, ApplianceADT a, int index) {
    	JsonParser parser = new JsonParser();
    	Gson gson = new Gson();
    	MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		MongoDatabase db = client.getDatabase("enefficient-users");
		MongoCollection<Document> uCol = db.getCollection(id);
		JsonElement raw_user = parser.parse(new BasicDBObject(uCol.find().first()).toJson());
		UserADT user = gson.fromJson(raw_user, UserADT.class);
		user.getAppliances().get(index).add(a);
		String json = gson.toJson(user);
		ObjectId uid = (ObjectId) uCol.find().first().get("_id");
		uCol.deleteOne(new Document("_id", uid));
		Document doc = Document.parse(json);
		uCol.insertOne(doc);
		client.close();
    }
}