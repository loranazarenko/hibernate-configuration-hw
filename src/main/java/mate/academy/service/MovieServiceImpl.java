package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector.getInstance("mate.academy.dao");
    private static final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        movieDao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElse(null);
    }
}