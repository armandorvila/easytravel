package com.armandorv.easytravel.business.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.armandorv.easytravel.business.exception.BrokenDomainRuleException;

/**
 * DDD class which model a domain object and implements part of the domain
 * logic.
 * 
 * (Avoiding anemic entities: Martin Fowler)
 * 
 * @author armandorv
 * 
 */
public class Travel {

	private Long id = 0L;

	private String name;

	private String description;

	private String summary;

	private User user;

	private Boolean done = false;

	private Set<Destiny> destinies = new HashSet<>();

	// Domain logic

	public void addDestiny(Destiny destiny) throws BrokenDomainRuleException {
		if (done) {
			throw new BrokenDomainRuleException(
					"You can't remove a destiny because the travel is done!");
		}

		destinies.add(destiny);
	}

	public void removeDestiny(Destiny destiny) throws BrokenDomainRuleException {
		if (done) {
			throw new BrokenDomainRuleException(
					"You can't remove a destiny because the travel is done!");
		}

		destinies.remove(destiny);
	}

	public void markAsDone() throws BrokenDomainRuleException {
		if (done) {
			throw new BrokenDomainRuleException("This travel is already done !");
		}
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Boolean getDone() {
		return done;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Destiny> getDestinies() {
		return Collections.unmodifiableSet(destinies);
	}

	public void setDestinies(Set<Destiny> destinies) {
		this.destinies = destinies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destinies == null) ? 0 : destinies.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Travel other = (Travel) obj;
		if (destinies == null) {
			if (other.destinies != null)
				return false;
		} else if (!destinies.equals(other.destinies))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Travel [id=" + id + ", name=" + name + ", description="
				+ description + ", summary=" + summary + ", user=" + user
				+ ", done=" + done + ", destinies=" + destinies + "]";
	}

}
