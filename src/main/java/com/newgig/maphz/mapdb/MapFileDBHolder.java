package com.newgig.maphz.mapdb;

import java.io.File;

import org.mapdb.DB;
import org.mapdb.DBMaker;

public class MapFileDBHolder {

	private static final String COLLECTIONS = "collections";
	private DB db;
	
	public void createDbInstance() {
		this.db = DBMaker.newFileDB(new File(COLLECTIONS)) //TODO: user define file name.
			.closeOnJvmShutdown()
			.make();
	}
	
	public DB getDb() {
		return db;
	}
	
	public void setDb(DB db) {
		this.db = db;
	}

	public void close() {
		this.db.close();
	}

	
}
