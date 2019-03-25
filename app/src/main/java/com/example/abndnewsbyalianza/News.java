package com.example.abndnewsbyalianza;

/**
 * An {@link News} object contains information related to a single entertainment news article.
 */
public class News {

    /** The name of The Guardian section that the entertainment news article appears in */
    private String mNewsArticleSectionName;

    /** Title of the entertainment news article */
    private String mNewsArticleTitle;

    /** Author of the entertainment news article */
    private String mNewsArticleAuthor;

    /** Date the entertainment news article was published */
    private String mNewsArticlePublicationDate;

    /** Website URL for the entertainment news article */
    private String mNewsArticleUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param NewsArticleSectionName is the name of The Guardian section that the entertainment
     *                               news article appears in
     * @param NewsArticleTitle is the title of the entertainment news article
     * @param NewsArticleAuthor is the author of the entertainment news article
     * @param NewsArticlePublicationDate is the date the entertainment news article was published
     * @param NewsArticleUrl is the website URL for the entertainment news article
     */
    public News(String NewsArticleSectionName, String NewsArticleTitle, String NewsArticleAuthor,
                String NewsArticlePublicationDate, String NewsArticleUrl) {

        mNewsArticleSectionName = NewsArticleSectionName;
        mNewsArticleTitle = NewsArticleTitle;
        mNewsArticleAuthor = NewsArticleAuthor;
        mNewsArticlePublicationDate = NewsArticlePublicationDate;
        mNewsArticleUrl = NewsArticleUrl;
    }

    /**
     * Returns the name of The Guardian section that the entertainment
     * news article appears in.
     */
    public String getNewsArticleSectionName() {
        return mNewsArticleSectionName;
    }

    /**
     * Returns the title of the entertainment news article.
     */
    public String getNewsArticleTitle() {
        return mNewsArticleTitle;
    }

    /**
     * Returns the title of the author of the entertainment news article.
     */
    public String getNewsArticleAuthor() {
        return mNewsArticleAuthor;
    }

    /**
     * Returns the date the entertainment news article was published.
     */
    public String getNewsArticlePublicationDate() {
        return mNewsArticlePublicationDate;
    }

    /**
     * Returns the website URL for the entertainment news article.
     */
    public String getNewsArticleUrl() {
        return mNewsArticleUrl;
    }
}

