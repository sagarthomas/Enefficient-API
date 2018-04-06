/**
 * This class is a Spring MVC controller which takes in details of an appliance and attempts to find it in the dataset
 * @author Matthew Dombrady
 */

package app;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.adt.*;
import model.adt.ClothesDryerADT;
import model.util.Dataset;
import model.util.MergeSort;
import model.FindAppliance;

@RestController
public class ControllerTest {
	
		// This array will contain the list of appliances from the dataset of the specified type to be searched
		private static ApplianceADT[] app;
		
		
    

    @RequestMapping("/find")
    public ApplianceReturn find(@RequestParam(value="type", defaultValue="World") String type, @RequestParam(value="brand", defaultValue="World") String brand, @RequestParam(value="model", defaultValue="World") String model) {
    	
    	//String myshoe = FindArray.getArray("Dryer");
    	
    	Dataset.init();
    	
		try {
			
			// This "switch" statement checks the type of the desired appliance, and calls the FindAppliance class to find it in the dataset.
			// The proper casting is then performed, and the important information from the appliance is returned as an ApplianceReturn object
			// Merge sort must be called first because FindAppliance employs binary search.
			
			switch(type) {
			case "AirConditioner":
				app = new AirConditionerADT[Dataset.getAirconditioners().size()];
				Dataset.getAirconditioners().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found1 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found1.getBRAND_NAME(), found1.getMMODEL_NUM_1() , type, ((AirConditionerADT)found1).getConsumption());
		
			case "Dryer":
				app = new ClothesDryerADT[Dataset.getDryers().size()];
				Dataset.getDryers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found2 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found2.getBRAND_NAME(), found2.getMMODEL_NUM_1() , type, ((ClothesDryerADT)found2).getConsumption());
				
			case "Cooktop":
				app = new CooktopADT[Dataset.getCooktops().size()];
				Dataset.getCooktops().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found3 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found3.getBRAND_NAME(), found3.getMMODEL_NUM_1() , type, ((CooktopADT)found3).getConsumption());
				
			case "Dishwasher":
				app = new DishwasherADT[Dataset.getDishwashers().size()];
				Dataset.getDishwashers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found4 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found4.getBRAND_NAME(), found4.getMMODEL_NUM_1() , type, ((DishwasherADT)found4).getConsumption());
			
			case "Freezer":
				app = new FreezerADT[Dataset.getFreezers().size()];
				Dataset.getFreezers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found5 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found5.getBRAND_NAME(), found5.getMMODEL_NUM_1() , type, ((FreezerADT)found5).getConsumption());
			
			case "Oven":
				app = new OvenADT[Dataset.getOvens().size()];
				Dataset.getOvens().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found6 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found6.getBRAND_NAME(), found6.getMMODEL_NUM_1() , type, ((OvenADT)found6).getConsumption());
			
			case "Range":
				app = new RangeADT[Dataset.getRanges().size()];
				Dataset.getRanges().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found7 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found7.getBRAND_NAME(), found7.getMMODEL_NUM_1() , type, ((RangeADT)found7).getConsumption());
			
			case "Refridgerator":
				app = new RefridgeratorADT[Dataset.getRefridgerators().size()];
				Dataset.getRefridgerators().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found8 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found8.getBRAND_NAME(), found8.getMMODEL_NUM_1() , type, ((RefridgeratorADT)found8).getConsumption());
			
			case "Washer":
				app = new WasherADT[Dataset.getWashers().size()];
				Dataset.getWashers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found9 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found9.getBRAND_NAME(), found9.getMMODEL_NUM_1() , type, ((WasherADT)found9).getConsumption());
			
			case "Washer-Dryer":
				app = new WasherDryerADT[Dataset.getWasherDryers().size()];
				Dataset.getWasherDryers().toArray(app);
				MergeSort.sort(app);
				ApplianceADT found10 = FindAppliance.find(app, brand, model);
				return new ApplianceReturn(found10.getBRAND_NAME(), found10.getMMODEL_NUM_1() , type, ((WasherDryerADT)found10).getConsumption());
				
			default:
				return new ApplianceReturn(type, brand, model, "0");
		
		}
    	
    
		} catch (Exception e) {
			// If appliance is not found, a casting error will occur.  In this case, return a placeholder object
			return new ApplianceReturn("Not found", "Not found", "Not found", "Not found");
		}     
    }
}