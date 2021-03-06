package cn.cxy.wanandroid.network

class ArticleRepo : BaseRepository() {
    suspend fun getChapters() = apiService.getChapters()
    suspend fun getArticle(chapterId: Int, pageNum: Int) = apiService.getArticle(chapterId, pageNum)

}