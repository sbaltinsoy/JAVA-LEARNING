import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "delete from world.city where id = ?";
            //System.out.println("Baglanti olustu");
            statement = connection.prepareStatement(sql);
            statement.setInt(1,10);
            statement.executeUpdate();
            System.out.println("Kayit silindi !");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "update world.city set population = 10, district = 'Duzce' where id = ?";
            //System.out.println("Baglanti olustu");
            statement = connection.prepareStatement(sql);
            statement.setInt(1,10);
            statement.executeUpdate();
            System.out.println("Kayit guncellendi !");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            String sql = "insert into world.city (Name,CountryCode,District,Population) values(?,?,?,?)";
            //System.out.println("Baglanti olustu");
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Duzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);
            statement.executeUpdate();
            System.out.println("Kayit eklendi !");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try{
            connection = helper.getConnection();
            //System.out.println("Baglanti olustu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();

            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}
