package com.jsdroid.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jsdroid.app.entity.Tool;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TOOL".
*/
public class ToolDao extends AbstractDao<Tool, Long> {

    public static final String TABLENAME = "TOOL";

    /**
     * Properties of entity Tool.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Pkg = new Property(1, String.class, "pkg", false, "PKG");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Version = new Property(3, String.class, "version", false, "VERSION");
        public final static Property Icon = new Property(4, String.class, "icon", false, "ICON");
        public final static Property Note = new Property(5, String.class, "note", false, "NOTE");
        public final static Property DownloadUrl = new Property(6, String.class, "downloadUrl", false, "DOWNLOAD_URL");
        public final static Property LastRunTime = new Property(7, java.util.Date.class, "lastRunTime", false, "LAST_RUN_TIME");
        public final static Property Favorite = new Property(8, boolean.class, "favorite", false, "FAVORITE");
    }


    public ToolDao(DaoConfig config) {
        super(config);
    }
    
    public ToolDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TOOL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PKG\" TEXT," + // 1: pkg
                "\"NAME\" TEXT," + // 2: name
                "\"VERSION\" TEXT," + // 3: version
                "\"ICON\" TEXT," + // 4: icon
                "\"NOTE\" TEXT," + // 5: note
                "\"DOWNLOAD_URL\" TEXT," + // 6: downloadUrl
                "\"LAST_RUN_TIME\" INTEGER," + // 7: lastRunTime
                "\"FAVORITE\" INTEGER NOT NULL );"); // 8: favorite
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TOOL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Tool entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String pkg = entity.getPkg();
        if (pkg != null) {
            stmt.bindString(2, pkg);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String version = entity.getVersion();
        if (version != null) {
            stmt.bindString(4, version);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(6, note);
        }
 
        String downloadUrl = entity.getDownloadUrl();
        if (downloadUrl != null) {
            stmt.bindString(7, downloadUrl);
        }
 
        java.util.Date lastRunTime = entity.getLastRunTime();
        if (lastRunTime != null) {
            stmt.bindLong(8, lastRunTime.getTime());
        }
        stmt.bindLong(9, entity.getFavorite() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Tool entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String pkg = entity.getPkg();
        if (pkg != null) {
            stmt.bindString(2, pkg);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String version = entity.getVersion();
        if (version != null) {
            stmt.bindString(4, version);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(6, note);
        }
 
        String downloadUrl = entity.getDownloadUrl();
        if (downloadUrl != null) {
            stmt.bindString(7, downloadUrl);
        }
 
        java.util.Date lastRunTime = entity.getLastRunTime();
        if (lastRunTime != null) {
            stmt.bindLong(8, lastRunTime.getTime());
        }
        stmt.bindLong(9, entity.getFavorite() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Tool readEntity(Cursor cursor, int offset) {
        Tool entity = new Tool( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pkg
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // version
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // icon
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // note
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // downloadUrl
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // lastRunTime
            cursor.getShort(offset + 8) != 0 // favorite
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Tool entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPkg(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setVersion(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNote(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDownloadUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLastRunTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setFavorite(cursor.getShort(offset + 8) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Tool entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Tool entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Tool entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
