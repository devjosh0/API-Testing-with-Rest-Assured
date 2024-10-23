package LocalServerAPIs;

import org.testng.annotations.DataProvider;

public class DataSets {
    @DataProvider(name = "DataForPost")
    public Object[][] dataForPost(){
        Object[][] data = new Object[2][3];
        data[0][0] = "Kelvin";
        data[0][1] = "Gans";
        data[0][2] = 4;

        data[1][0] = "Sarah";
        data[1][1] = "Scott";
        data[1][2] = 5;
        return data;
        // We created an object function because our test data is going to contain different datasets
        //Object[][] means two-dimensional columns(FirstName,lastname,subjectId) and row(test data)



    }
    @DataProvider(name = "DataSetsForPost")
    public Object[][] dataForTest(){
        return new Object[][] {
                {"Graham","Bell",3},
                {"Belly","Ford",6}
        };
    }

    @DataProvider(name = "DataSetsForDelete")
    public Object[] dataFordelete(){
        return new Object[] {
                7,8,9
        };
    }
}
