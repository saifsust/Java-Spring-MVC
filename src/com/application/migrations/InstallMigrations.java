package com.application.migrations;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Migrations;

public class InstallMigrations implements Migrations {

	private String query;

	public InstallMigrations(JdbcTemplate jdbcTemplate) {
		create(jdbcTemplate);

		// project tools
		project_tools(jdbcTemplate);
		// rank table install
		ranks(jdbcTemplate);
		// engineer table install
		engineers(jdbcTemplate);
		// developer_group table install
		developers_groups(jdbcTemplate);
		// client table install
		clients(jdbcTemplate);
		// work_page table install
		// work_page(jdbcTemplate);
		// social media table install
		social_medias(jdbcTemplate);
		// projects table install
		projects(jdbcTemplate);
		// latest work table
		latest_projects(jdbcTemplate);
		// service table installss
		services(jdbcTemplate);
		// selected clients table install
		selected_clients(jdbcTemplate);
		// selected services
		selected_services(jdbcTemplate);
		// selected engineers
		selected_engineers(jdbcTemplate);
		// install home
		home(jdbcTemplate);
		// install about
		about(jdbcTemplate);
		// install works
		project_page(jdbcTemplate);
		// install service page
		services_page(jdbcTemplate);
		// install service plan
		services_plan(jdbcTemplate);
		selected_page(jdbcTemplate);

	}

	private void selected_page(JdbcTemplate jdbcTemplate) {
		query = CREATE_TABEL + ".pages(page_id int(11) " + ID + ",selected_page_id int(11) default 1)";
		try {
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	// projecta page install

	private void services_plan(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".services_plan";
			// jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	private void project_tools(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".project_tools(tool_id int(11)" + ID + ",tool_name varchar(100))";
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// projecta page install

	private void services_page(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".services_page(service_page_id int(11) " + ID
					+ ",header varchar(300), header_detail text, services varchar(100) default 'services', service_plan varchar(100) default 'service_plan',"
					+ "end_header varchar(300),end_detail text,social_medias varchar(100) default 'social_medias')";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// projecta page install

	private void project_page(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".project_page(project_page_id int(11) " + ID
					+ ",header varchar(300), header_detail text, projects varchar(100) default 'projects',"
					+ "end_header varchar(300),end_detail text,social_medias varchar(100) default 'social_medias')";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// about page install

	private void about(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".about(about_id int(11) " + ID
					+ ",header varchar(300), header_detail text, selected_services varchar(100) default 'selected_services',"
					+ " selected_engineers varchar(100) default 'selected_engineers', end_header varchar(300),end_detail text,social_medias varchar(100) default 'social_medias')";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// home page install

	private void home(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".home(home_id int(11) " + ID
					+ ",header_img text,header varchar(300),latest_projects varchar(100) default 'latest_projects',first_class_project_id int(11),"
					+ " selected_services varchar(100) default 'selected_services', selected_clients varchar(100) default 'selected_clients',"
					+ " end_header varchar(300),end_detail text,social_medias varchar(100) default 'social_medias')";
			/// + " foreign key(first_class_project_id) references " + DATABASE_NAME +
			/// ".projects(project_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// selected engineers

	private void selected_engineers(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".selected_engineers(selected_engineer_id int(5) " + ID + ",engineer_id int(11))";
			// foreign key(engineer_id) references " + DATABASE_NAME
			// + ".engineers(engineer_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// selected services

	private void selected_services(JdbcTemplate jdbcTemplate) {

		try {
			query = CREATE_TABEL + ".selected_services(selected_service_id int(5) " + ID + ",service_id int(11))";// foreign
																													// key(service_id)
																													// references
																													// "
																													// +
																													// DATABASE_NAME
			// + ".services(service_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	// service table installss
	private void services(JdbcTemplate jdbcTemplate) {
		try {

			query = CREATE_TABEL + ".services(service_id int(11) " + ID
					+ ",service_title varchar(300),service_logo text,service_detail text ,engineer_id int(11))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);

		}
	}

	public void create(JdbcTemplate jdbcTemplate) {

		query = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME;
		jdbcTemplate.execute(query);
	}

	// selected clients table install

	private void selected_clients(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".selected_clients(selected_client_id int(5) " + ID + ", client_id int(11))";// foreign
																												// key(client_id)
																												// references
																												// " +
																												// DATABASE_NAME
																												// +
																												// ".clients(client_id))";
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// latest work table
	private void latest_projects(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".latest_projects(latest_project_id int(5) " + ID + ",project_id int(11))";
			// foreign key(project_id) references " + DATABASE_NAME +
			// ".projects(project_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// projects table install
	private void projects(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".projects(project_id int(11)" + ID
					+ ",project_title varchar(200),project_img text, detail text, order_date date,delevery_date date,client_id int(11),project_tools varchar(300) default 'N', developer_group_id int(11),deal_detail text,isComplete bool default false)";
			// ,foreign
			// key(client_id)
			// references
			// "
			// + DATABASE_NAME + ".clients(client_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// social media table install
	private void social_medias(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".social_medias(media_id int(3) " + ID
					+ ",media_name varchar(100),media_logo text,media_link text)";
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// work_page table install

	private void work_page(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".work_page(work_page_id int(11) " + ID
					+ ",projects varchar(100) default 'projects' ,header varchar(300),header_detail text, end_header varchar(300),end_detail text,social_medias varchar(100) default 'social_medias')";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// client table install

	private void clients(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".clients(client_id int(11) " + ID
					+ " ,first_name varchar(100),last_name varchar(100),mail varchar(200), password text,profile_pic text,company_logo text, detail text)";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// developer_group table install
	private void developers_groups(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".developers_groups (developer_group_id int(11)" + ID + ",group_name text)";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// engineer table install

	private void engineers(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".engineers(engineer_id int(11)" + ID
					+ ", first_name varchar(100),last_name varchar(100),picture text,about_your_self text, user_id text,user_password text,mail text, rank_id int(5))";
			// foreign key(rank_id) references "
			// + DATABASE_NAME + ".ranks(rank_id))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// rank table install

	private void ranks(JdbcTemplate jdbcTemplate) {
		try {
			query = CREATE_TABEL + ".ranks(rank_id int(5)" + ID + ",rank varchar(100))";
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// project tools install

	public static boolean creatProjectTools(String project_tool_name, JdbcTemplate jdbcTemplate) {
		try {

			String query = CREATE_TABEL + "." + project_tool_name + "(project_tool_id int(5) " + ID
					+ ",tool_name varchar(100))";
			jdbcTemplate.execute(query);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return true;
	}

	// group name table install
	public static boolean createGroup(String group_name, JdbcTemplate jdbcTemplate) {
		try {
			String query = CREATE_TABEL + "." + group_name + " ( group_id int(11) " + ID
					+ ",engineer_id int(11) not null unique)";
			// foreign key(engineer_id) references " + DATABASE_NAME
			// + ".engineers(engineer_id))";
			jdbcTemplate.execute(query);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return true;
	}

}
