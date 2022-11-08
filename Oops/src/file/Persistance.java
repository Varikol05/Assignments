package file;
abstract class Persistence{
    //abstract method
    public abstract void persist();
}
class FilePersistence extends Persistence{



   @Override
    public void persist() {
        // TODO Auto-generated method stub
        System.out.println("The Client Data is stored in terms of Files");
    }
    
}

