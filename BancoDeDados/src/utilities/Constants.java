package utilities;

public class Constants {
    public static final String URL_MEU_BANCO = "jdbc:sqlite:S:/Users/17.04091-4/Desktop/ecm251-2019/SQLiteDatabaseBrowserPortable/Data/MeuBanco.db";
    public static final int ID_NULO = -1;
    public static final String TABELA_USUARIO = "usuarios";


    public static final String getInsert(String table,int paramsCount){
        String sqlInsert = "Insert into " + table + " values (";
        for (int i = 0; i<paramsCount -1; i++)
            sqlInsert += "?,";
        sqlInsert += "?);";
        return sqlInsert;
    }


    public static final String selectAll (String table){
        return "SELECT * FROM " + table + ";";
    }

    public static final String selectFilter (String nome, String table){
        return "SELECT WHERE nome= " + nome + "FROM " + table+ ";";
    }
}
