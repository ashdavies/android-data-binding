package io.ashdavies.databinding.repos

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import io.ashdavies.databinding.models.Repo

internal class RepoViewState(
    val data: LiveData<PagedList<Repo>>,
    val errors: LiveData<Throwable>
)
