abstract class Language {


    public void display(){
        System.out.println("this is java Programming");
    }
}

class Lang extends Language {

    public static void main(String[] args) {
        Lang obj = new Lang();
        obj.display();
    }
}
