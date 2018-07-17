package com.database;

import java.sql.*;

/**
 * @author 王扶摇
 * @Title: PostageUtil
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/13 15:23
 */
public class PostgreUtil {

    private PostgreUtil(String a) {
    }



    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<Connection>() {
        @Override
        public Connection get() {
            try {
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return DriverManager.getConnection("jdbc:postgresql://localhost:5432/school",
                        "postgres", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    /**
     * @Author 王扶摇
     * @Description //TODO
     * @Date 15:23 2018/7/13
     * @Param [sql]
     * @return void
     */
    public static void doSelect(String sql) throws SQLException {
        int columnCount;
        Connection connection = connectionThreadLocal.get();

        System.out.println("连接："+connection);

        Statement statement = connection.prepareStatement(sql);


        ResultSet resultSet = ((PreparedStatement) statement).executeQuery();

        ResultSetMetaData metaData = resultSet.getMetaData();

        System.out.println("表名" + metaData.getTableName(1));

        columnCount = metaData.getColumnCount();
        for (int i = 1; i < columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + "     | ");
        }
        System.out.println();

        while (resultSet.next()) {
            for (int i = 1; i <columnCount; i++) {
                if (i == columnCount){System.out.println(resultSet.getString(i) + " | ");}
                else {System.out.print(resultSet.getString(i) + " | ");}
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");

        connection.close();
        statement.close();
        resultSet.close();
    }


}
