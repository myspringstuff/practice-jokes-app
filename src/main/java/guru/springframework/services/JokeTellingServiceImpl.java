package guru.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeTellingServiceImpl implements JokeTellingService {
    private ChuckNorrisQuotes quotes;

    public JokeTellingServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String tellJoke() {
        return quotes.getRandomQuote();
    }
}
