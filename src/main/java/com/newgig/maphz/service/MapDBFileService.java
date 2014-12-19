package com.newgig.maphz.service;

import java.util.Properties;

import com.hazelcast.core.DistributedObject;
import com.hazelcast.spi.ManagedService;
import com.hazelcast.spi.NodeEngine;
import com.hazelcast.spi.RemoteService;
import com.newgig.maphz.mapdb.MapFileDBHolder;

public class MapDBFileService implements ManagedService,RemoteService {

	
	private static MapFileDBHolder mapDbHolder = new MapFileDBHolder();
	
	public void init(NodeEngine nodeEngine, Properties properties) {
		//TODO: properties collection path
		mapDbHolder.createDbInstance();
	}

	public void reset() {
		
	}

	public void shutdown(boolean terminate) {
		if (terminate) mapDbHolder.close();
	}

	public DistributedObject createDistributedObject(String objectName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroyDistributedObject(String objectName) {
		// TODO Auto-generated method stub
		
	}

}
