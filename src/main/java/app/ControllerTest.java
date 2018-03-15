package app;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.adt.*;
import model.adt.ClothesDryerADT;
import model.util.Dataset;
import model.FindAppliance;

@RestController
public class ControllerTest {
		private static ApplianceADT[] app;
    

    @RequestMapping("/find")
    public ApplianceReturn find(@RequestParam(value="type", defaultValue="World") String type, @RequestParam(value="brand", defaultValue="World") String brand, @RequestParam(value="model", defaultValue="World") String model) {
    	
    	//String myshoe = FindArray.getArray("Dryer");
    	
    	app = new ApplianceADT[3];
    	
    	app[0] = new ClothesDryerADT("AGE", "12345", "Elijah", model, model, model, model, model, model, model, model, model);
		app[1] = new ClothesDryerADT("Elijah", "99999", "Elijah", model, model, model, model, model, model, model, model, model);
		app[2] = new ClothesDryerADT("AGE", "MASURE-99", "Elijah", model, model, model, model, model, model, model, model, model);
    	
    	
		
		switch(type) {
			case "AirConditioner":
				AirConditionerADT found1 = (AirConditionerADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found1.getBRAND_NAME(), found1.getMMODEL_NUM_1(), type, found1.getConsumption());
		
			case "Dryer":
				ClothesDryerADT found2 = (ClothesDryerADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found2.getBRAND_NAME(), found2.getMMODEL_NUM_1(), type, found2.getConsumption());
				
			case "Cooktop":
				CooktopADT found3 = (CooktopADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found3.getBRAND_NAME(), found3.getMMODEL_NUM_1(), type, found3.getConsumption());
				
			case "Dishwasher":
				DishwasherADT found4 = (DishwasherADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found4.getBRAND_NAME(), found4.getMMODEL_NUM_1(), type, found4.getConsumption());
			
			case "Freezer":
				FreezerADT found5 = (FreezerADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found5.getBRAND_NAME(), found5.getMMODEL_NUM_1(), type, found5.getConsumption());
			
			case "Oven":
				OvenADT found6 = (OvenADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found6.getBRAND_NAME(), found6.getMMODEL_NUM_1(), type, found6.getConsumption());
			
			case "Range":
				RangeADT found7 = (RangeADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found7.getBRAND_NAME(), found7.getMMODEL_NUM_1(), type, found7.getConsumption());
			
			case "Refridgerator":
				RefridgeratorADT found8 = (RefridgeratorADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found8.getBRAND_NAME(), found8.getMMODEL_NUM_1(), type, found8.getConsumption());
			
			case "Washer":
				WasherADT found9 = (WasherADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found9.getBRAND_NAME(), found9.getMMODEL_NUM_1(), type, found9.getConsumption());
			
			case "Washer-Dryer":
				WasherDryerADT found10 = (WasherDryerADT) FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found10.getBRAND_NAME(), found10.getMMODEL_NUM_1(), type, found10.getConsumption());
				
			default:
				return new ApplianceReturn(type, brand, model, "0");
		
		}
    	
    	     
    }
}