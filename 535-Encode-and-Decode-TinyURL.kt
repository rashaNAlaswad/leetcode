class Codec() {
    val urlMap = HashMap<String, String>()
    val baseUrl ="http://tinyurl.com/"
    var id=1
    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        var shortUrl = generateShortUrl()
        urlMap[shortUrl] = longUrl
        return "$baseUrl$shortUrl"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        val key = shortUrl.removePrefix(baseUrl)
        return urlMap[key] ?: ""
    }

    fun generateShortUrl() : String{
        return UUID.randomUUID().toString().take(7)
    } 
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */