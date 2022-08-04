public interface CocheCRUD {

    public default void save(){
        System.out.println("Metodo save");
    }

    public default void findAll(){
        System.out.println("Metodo findAll()");
    }

    public default void delete(){
        System.out.println("Metodo findAll()");
    }
}
