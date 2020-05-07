package academy.learnprogramming;

public class Car { //klasa to szablon

    private int doors; //state/field of a car
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        //validacja zapisu // .equals by przetestowac daną wartość czy jest = innemy typowi
        if(validModel.equals("carrera") || validModel.equals("commodore")){

            //zeby okreslić że updateujemy field o tej samej nazwie a nie ten parametr w ()
            this.model = model;// uptade "private String model"\z zawartością przekazanego nam modelu parametrów
            // ten pierwszy model to ten z góry (firld) ze state a ten po = to z metody ( parameter)

        }else{
            this.model = "Uknown"
;        }
        }

    public  String getModel(){
        return this.model;
    }


}
