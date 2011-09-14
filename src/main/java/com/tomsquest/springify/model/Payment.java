package com.tomsquest.springify.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Payment")
public class Payment implements Serializable {

	private Long id;
	private String label;
	private Date date;
	private Double value;
	private Set<Tag> tags;

	public Payment() {
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

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(final Double value) {
		this.value = value;
	}

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "Payment_Tag", joinColumns = { @JoinColumn(name = "Payment_id") }, inverseJoinColumns = { @JoinColumn(name = "Tag_id") })
	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(final Set<Tag> tags) {
		this.tags = tags;
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
		sb.append(" date:=");
		sb.append(date);
		sb.append(" value:=");
		sb.append(value);
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
		if (!(o instanceof Payment)) {
			return false;
		}
		Payment castedObj = (Payment) o;
		return ((this.getId() == castedObj.getId()) && (this.getLabel() == null ? castedObj.getLabel() == null : this.getLabel().equals(castedObj.getLabel()))
				&& (this.getDate() == null ? castedObj.getDate() == null : this.getDate().equals(castedObj.getDate())) && (this.getValue() == null ? castedObj
				.getValue() == null : this.getValue().equals(castedObj.getValue())));
	}

	@Override
	public int hashCode() {
		int hashCode = 1;
		hashCode = 31 * hashCode + (getLabel() == null ? 0 : getLabel().hashCode());
		hashCode = 31 * hashCode + (getDate() == null ? 0 : getDate().hashCode());
		hashCode = 31 * hashCode + (getValue() == null ? 0 : getValue().hashCode());
		return hashCode;
	}
}
