package br.com.designpattern.mhrs.comportamentais.templatemethod.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ModelPersist {
	
	public ModelPersist save() {
		preSave();
		prePersist();
		log.info(String.format("Saving %s in database", this.getClass().getSimpleName()));
		postSave();
		return this;
	}
	
	public ModelPersist update() {
		preUpdate();
		prePersist();
		log.info(String.format("Updating %s in database", this.getClass().getSimpleName()));
		postUpdate();
		return this;
	}
	
	public void delete() {
		preDelete();
		log.info(String.format("Removing %s in database", this.getClass().getSimpleName()));
		postDelete();
	}

	protected abstract void preSave();
	protected  void postSave() {
		// Override this method if you want to add a new behavior
	}
	protected void prePersist() {
		// Override this method if you want to add a new behavior
	}
	protected void preUpdate() {
		// Override this method if you want to add a new behavior
	}
	protected void postUpdate() {
		// Override this method if you want to add a new behavior
	}
	protected void preDelete() {
		// Override this method if you want to add a new behavior
	}
	protected void postDelete() {
		// Override this method if you want to add a new behavior
	}
}
