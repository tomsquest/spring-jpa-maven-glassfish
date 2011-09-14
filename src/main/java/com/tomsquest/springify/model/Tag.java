package com.tomsquest.springify.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tag")
public class Tag implements Serializable {

	private Long id;
	private String label;
	private Set<Payment> payments;

	public Tag() {
	}

	public Tag(final String label) {
		this.label = label;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	@ManyToMany
	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(final Set<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Payment::[");
		sb.append(super.toString() + " ");
		sb.append(" id:=");
		sb.append(id);
		sb.append(" label:=");
		sb.append(label);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Tag)) {
			return false;
		}
		Tag castedObj = (Tag) o;
		return ((this.getId() == castedObj.getId()) && (this.getLabel() == null ? castedObj.getLabel() == null : this.getLabel().equals(castedObj.getLabel())));
	}

	@Override
	public int hashCode() {
		return 31 + (getLabel() == null ? 0 : getLabel().hashCode());
	}
}
