package com.gonie.rest_webservices_api.restful_webservices_api.versioning;

public class PersonV2 {
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}

}
