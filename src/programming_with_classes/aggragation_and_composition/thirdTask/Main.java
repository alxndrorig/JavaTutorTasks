package programming_with_classes.aggragation_and_composition.thirdTask;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {
        District central = new District("Central", 21);
        District soviet = new District("Soviet", 51);
        District railway = new District("Railway", 41);
        District novobelitsky = new District("Novobelitsky", 20);

        City gomel = new City("Gomel", new District[]{central, soviet, railway, novobelitsky}, true, false);
        City rechitsa = new City("Rechitsa", 29, false, false);

        Region gomelRegion = new Region("Gomel region", new City[]{gomel, rechitsa});
        gomelRegion.setArea(40372);

        Region minskRegion = new Region("Minsk region", new City[]{new City("Minsk", 348, true, true)}, 39912);
        Region vitebskRegion = new Region("Vitebsk region", new City[]{new City("Vitebsk", 134, true, false)}, 40051);
        Region mogilevRegion = new Region("Mogilev region", new City[]{new City("Mogilev", 118, true, false)}, 29068);
        Region grodnoRegion = new Region("Grodno region", new City[]{new City("Grodno", 142, true, false)}, 25127);
        Region brestRegion = new Region("Brest region", new City[]{new City("Brest", 146, true, false)}, 32787);

        State belarus = new State("Belarus", new Region[]{brestRegion, mogilevRegion, gomelRegion, grodnoRegion, vitebskRegion, minskRegion});

        belarus.showCapital();
        belarus.showRegionsCount();
        belarus.showRegions();
        belarus.showArea();
    }
}
