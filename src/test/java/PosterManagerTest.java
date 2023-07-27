import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Тролли. Мировой тур";
        String poster7 = "Номер один";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);

        String[] actual = manager.findAll();
        String[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSize() {
        PosterManager manager = new PosterManager();
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);

        String[] actual = manager.findLast();
        String[] expected = {poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        PosterManager manager = new PosterManager();
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Тролли. Мировой тур";
        String poster7 = "Номер один";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);

        String[] actual = manager.findLast();
        String[] expected = {poster7, poster6, poster5, poster4, poster3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSize() {
        PosterManager manager = new PosterManager();
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);


        String[] actual = manager.findLast();
        String[] expected = {poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(4);
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);

        String[] actual = manager.findLast();
        String[] expected = {poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(3);
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Тролли. Мировой тур";
        String poster7 = "Номер один";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);

        String[] actual = manager.findLast();
        String[] expected = {poster7, poster6, poster5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        PosterManager manager = new PosterManager(7);
        String poster1 = "Бладшот";
        String poster2 = "Вперёд";
        String poster3 = "Отель \"Белград\"";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Тролли. Мировой тур";

        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);


        String[] actual = manager.findLast();
        String[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
