package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.estudiante;
import model.registro;
import util.DbUtil;

public class UDao {

	private Connection connection;
	public UDao() {
		connection = DbUtil.getConnection();
	}

	public registro validar(registro registro) {
	    try {
	 	PreparedStatement preparedStatement = null;
                String consulta = "select estudiante.codigoEs, (registro.nota)>4.5 from estudiante, registro where registro.semestre<>'2018_II' and registro.codEstudiante=estudiante.codigoEs group by registro.codEstudiante;";
                preparedStatement = connection.prepareStatement(consulta);
                preparedStatement.setInt(1, registro.getCodEstudiante());

		} catch (SQLException e) {
			e.printStackTrace();
		}
            
            return null;
	}
	
	
}
