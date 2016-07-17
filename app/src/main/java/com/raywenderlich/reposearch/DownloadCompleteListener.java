package com.raywenderlich.reposearch;

import java.util.ArrayList;

/**
 * Created by Don on 16/7/17.
 */
public interface DownloadCompleteListener {
    void downloadComplete(ArrayList<Repository> repositories);
}
