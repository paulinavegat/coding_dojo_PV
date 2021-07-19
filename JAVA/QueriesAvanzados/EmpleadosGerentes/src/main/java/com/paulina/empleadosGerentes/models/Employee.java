package com.paulina.empleadosGerentes.models;

	import java.util.Date;
	import java.util.List;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;
	import javax.persistence.PrePersist;
	import javax.persistence.PreUpdate;
	import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

	@Entity
	@Table(name = "employees")
	public class Employee {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		@Size (min=3, max=255)
		private String first_name;
		@Size (min=3, max=255)
		private String last_name;
		
		@Column(updatable = false)
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date updatedAt;
		
	    
	    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
	    private List<Employee> employees;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "manager_id")
	    private Employee manager;
	    
	    public Employee() {
	    	
	    }
	    
		public Employee(String first_name, String last_name) {
			this.first_name = first_name;
			this.last_name = last_name;
		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}

		public Employee getManager() {
			return manager;
		}

		public void setManager(Employee manager) {
			this.manager = manager;
		}
		
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
		
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	}

