package com.company.summativeprojectone.controller;

import com.company.summativeprojectone.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteServiceController {
    private List<Quote> quotes = new ArrayList<>();
    private Random randomGenerator = new Random();

    public QuoteServiceController() {
        this.quotes.add(new Quote("1","Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall."));
        this.quotes.add(new Quote("2","Walt Disney", "The way to get started is to quit talking and begin doing."));
        this.quotes.add(new Quote("3","Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking."));
        this.quotes.add(new Quote("4","Eleanor Roosevelt", "If life were predictable it would cease to be life, and be without flavor."));
        this.quotes.add(new Quote("5","Oprah Winfrey", "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough."));
        this.quotes.add(new Quote("6","James Cameron", "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success."));
        this.quotes.add(new Quote("7","John Lennon", "Life is what happens when you're busy making other plans."));
        this.quotes.add(new Quote("8","Cristiano Ronaldo", "We cannot live being obsessed with what other people think about us. It's impossible to live like that. Not even God managed to please the entire world."));
        this.quotes.add(new Quote("9","Anne Frank", "Whoever is happy will make others happy too. "));
        this.quotes.add(new Quote("10","Ralph Waldo Emerson", "Do not go where the path may lead, go instead where there is no path and leave a trail."));
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {
        int index = randomGenerator.nextInt(this.quotes.size());
        return quotes.get(index);
    }
}
