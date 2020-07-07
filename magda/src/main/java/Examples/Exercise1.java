package Examples;

import javax.print.attribute.standard.OrientationRequested;
import javax.swing.plaf.metal.MetalBorders;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        DataObject dataObject = new DataObject();
        dataObject.count = 5;

        DataObject dataObject1 = new DataObject();
        dataObject1.count = 6;

        DataObject dataObject2 = new DataObject();
        dataObject2.count = 3;

        DataObject[] dataObjects = new DataObject[]{dataObject, dataObject1, dataObject2};
        int sum = 0;

        for(DataObject objects : dataObjects){
            sum += objects.count;
        }
        System.out.println(sum);
    }
    //OR
//    DataObject[] dataObjects = new DataObject[3];
//
//    DataObject dataObject = new DataObject();
//    dataObject.count = 5;
//    dataObjects[0] = dataObject;
//
//    dataObject = new DataObject();
//    dataObject.count = 7;
//    dataObjects[1] = dataObject;
//
//    dataObject = new DataObject();
//    dataObject.count = 9;
//    dataObjects[2] = dataObject;

}
