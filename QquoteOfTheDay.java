public class QuoteOfTheDay
{
    private final Source<String> dataSource;

    private final Sink<String> dataSink;


    public QuoteOfTheDay()
    {
        List<String> data = new ArrayList<String>(11);
        data.add("Be yourself; everyone else is already taken.― Oscar Wilde");
        data.add("A room without books is like a body without a soul. ― Marcus Tullius Cicero");
        data.add("Be the change that you wish to see in the world. ― Mahatma Gandhi");
        data.add("If you tell the truth, you don't have to remember anything. ― Mark Twain");
        data.add("If you want to know what a man's like, take a good look at how he         treats his inferiors, not his equals.― J.K. Rowling");
        data.add("To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde");
        data.add("Without music, life would be a mistake. ― Friedrich Nietzsche");
        data.add("Always forgive your enemies, nothing annoys them so much. ― Oscar Wilde");
        data.add("Life isn't about getting and having, it's about giving and being. –Kevin Kruse");
        data.add("Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill");
        data.add("Strive not to be a success, but rather to be of value. –Albert Einstein");

        this.dataSource = new RandomQuoteProvider(data);
        this.dataSink = new CommandLinePrinter();
    }

    public void print()
    {
        this.dataSink.put(this.dataSource.getNext());
    }

    public static void main(String[] args)
    {
        QuoteOfTheDay quoteOfTheDay = new QuoteOfTheDay();
        quoteOfTheDay.print();
    }
}
