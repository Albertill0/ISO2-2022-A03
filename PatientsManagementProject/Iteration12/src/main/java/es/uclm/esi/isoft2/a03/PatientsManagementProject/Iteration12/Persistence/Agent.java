package es.uclm.esi.isoft2.a03.PatientsManagementProject.Iteration12.Persistence;

import java.sql.Connection;
import java.util.Vector;

public class Agent {
	private Agent _mInstance;
	private Connection _mBD;

	private Agent() {
		throw new UnsupportedOperationException();
	}

	public Agent getAgent() {
		throw new UnsupportedOperationException();
	}

	public void connect() {
		throw new UnsupportedOperationException();
	}

	public void disconnect() {
		throw new UnsupportedOperationException();
	}

	public Vector<Object> read(String aSql) {
		throw new UnsupportedOperationException();
	}

	public int insert(String aSql) {
		throw new UnsupportedOperationException();
	}

	public int update(String aSql) {
		throw new UnsupportedOperationException();
	}

	public int delete(String aSql) {
		throw new UnsupportedOperationException();
	}
}