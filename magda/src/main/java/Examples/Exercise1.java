package Examples;

//In the DataObject class insert a public member variable named code of type String
//        Expand the number of DataObject instances created in the beginning of the main() method in Exercise 5 to 5 instances.
//        Two of the DataObject instances should have their code member variable set to friday and the other three instances should have their code member variable set to saturday.
//        Inside the for loop, insert an if-statement so that it only adds the count member variable of DataObjects where the code variable is friday to the sum variable.


public class Exercise1 {
    public static void main(String[] args) {

        DataObject dataObject = new DataObject();
        dataObject.code = "friday";
        dataObject.count = 2;

        DataObject dataObject1 = new DataObject();
        dataObject1.code = "friday";
        dataObject1.count = 3;

        DataObject dataObject2 = new DataObject();
        dataObject2.code = "saturday";
        dataObject2.count =5;

        DataObject dataObject3 = new DataObject();
        dataObject2.code = "saturday";
        dataObject3.count = 7;

        DataObject dataObject4 = new DataObject();
        dataObject2.code = "saturday";
        dataObject4.count = 1;

        DataObject[] dataObjects = new DataObject[]{dataObject, dataObject1, dataObject2, dataObject3, dataObject4};
        int sum = 0;

        for(DataObject objects : dataObjects) {
            if (objects.code == "friday") { // objects.code.equals!!
                sum += objects.count;
            }
        }
            System.out.println(sum);
        }
    }


