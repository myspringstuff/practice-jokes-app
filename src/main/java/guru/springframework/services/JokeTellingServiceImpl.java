package guru.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeTellingServiceImpl implements JokeTellingService {
    private final ChuckNorrisQuotes quotes;

    public JokeTellingServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String tellJoke() {
        return this.quotes.getRandomQuote();
    }
}
