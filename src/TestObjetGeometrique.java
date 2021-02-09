public class TestObjetGeometrique {

    public static void main(String[] args) {

        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(2, 5);

        afficherInfos(cercle, rectangle);

    }

    public static void afficherInfos(ObjetGeometrique... objetGeometriques){
        for (ObjetGeometrique objetGeometrique : objetGeometriques) {
            System.out.println(objetGeometrique.surface());
            System.out.println(objetGeometrique.perimetre());
        }
    }


}
