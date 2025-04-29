package com.kroger.android.interview.hackernews.data.repository

import javax.inject.Inject

/**
 *  Repository for fetching hacker news data
 */
interface HackerNewsRepository {

}

class HackerNewsRepositoryReal @Inject constructor(): HackerNewsRepository {

}
