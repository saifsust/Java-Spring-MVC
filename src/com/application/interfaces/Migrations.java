package com.application.interfaces;

public interface Migrations {
	public final String DATABASE_NAME = "mybusiness";
	public final String CREATE_TABEL = "CREATE TABLE IF NOT EXISTS " + DATABASE_NAME;
	public final String ID = " auto_increment not null primary key ";
}
