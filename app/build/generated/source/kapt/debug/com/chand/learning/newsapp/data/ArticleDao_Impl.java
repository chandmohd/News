package com.chand.learning.newsapp.data;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleDao_Impl implements ArticleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsResponse> __insertionAdapterOfNewsResponse;

  private final ArticlesConverter __articlesConverter = new ArticlesConverter();

  private final EntityDeletionOrUpdateAdapter<NewsResponse> __updateAdapterOfNewsResponse;

  public ArticleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsResponse = new EntityInsertionAdapter<NewsResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `news` (`articles`,`status`,`totalResults`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsResponse value) {
        final String _tmp;
        _tmp = __articlesConverter.listToString(value.getArticles());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getStatus() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getStatus());
        }
        stmt.bindLong(3, value.getTotalResults());
      }
    };
    this.__updateAdapterOfNewsResponse = new EntityDeletionOrUpdateAdapter<NewsResponse>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `news` SET `articles` = ?,`status` = ?,`totalResults` = ? WHERE `totalResults` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsResponse value) {
        final String _tmp;
        _tmp = __articlesConverter.listToString(value.getArticles());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getStatus() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getStatus());
        }
        stmt.bindLong(3, value.getTotalResults());
        stmt.bindLong(4, value.getTotalResults());
      }
    };
  }

  @Override
  public void insertAll(final NewsResponse article) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNewsResponse.insert(article);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(final NewsResponse article) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNewsResponse.handle(article);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public NewsResponse getArticles() {
    final String _sql = "SELECT * FROM news";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfArticles = CursorUtil.getColumnIndexOrThrow(_cursor, "articles");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTotalResults = CursorUtil.getColumnIndexOrThrow(_cursor, "totalResults");
      final NewsResponse _result;
      if(_cursor.moveToFirst()) {
        final List<Article> _tmpArticles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfArticles);
        _tmpArticles = __articlesConverter.stringToList(_tmp);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        final int _tmpTotalResults;
        _tmpTotalResults = _cursor.getInt(_cursorIndexOfTotalResults);
        _result = new NewsResponse(_tmpArticles,_tmpStatus,_tmpTotalResults);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
