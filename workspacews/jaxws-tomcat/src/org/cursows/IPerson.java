package org.cursows;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.cursows.exception.PersonException;
import org.cursows.ws.type.PersonInfo;
import org.cursows.ws.type.SearchPerson;

@WebService
public interface IPerson {
	
	@WebMethod(operationName = "getPersonInfo")
	public PersonInfo getPerson(@WebParam(name = "searchPerson") SearchPerson sp)
			throws PersonException;
}
