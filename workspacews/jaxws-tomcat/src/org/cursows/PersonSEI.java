package org.cursows;

import javax.jws.WebService;

import org.cursows.exception.PersonException;
import org.cursows.ws.type.PersonInfo;
import org.cursows.ws.type.SearchPerson;

@WebService(serviceName="searchPerson",endpointInterface="org.cursows.IPerson")
public class PersonSEI implements IPerson {

	@Override
	public PersonInfo getPerson(SearchPerson sp) throws PersonException {
		return null;
	}
	
}
