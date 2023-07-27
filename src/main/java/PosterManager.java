public class PosterManager {
    private String[] posters = new String[0];
    private int limit = 5;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
    }

    public void addPoster(String newPoster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < posters.length) {
            resultLength = limit;
        } else {
            resultLength = posters.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }

}
