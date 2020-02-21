package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		rpcclient.connect();
		byte[] byteSend = RPCUtils.marshallInteger(RPCID, 0);
		byte[] byteRec = rpcclient.call(byteSend);
		int temp = RPCUtils.unmarshallInteger(byteRec);
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method
		
		/*if (true) {
			throw new UnsupportedOperationException(TODO.method());
		}*/
		
		return temp;
	}
	
}
