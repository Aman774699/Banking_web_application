/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operation;

import Customers.account_holder;
import java.sql.*;
import Myconnection.Getconnect;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Account_holder_operation {
    
    public void insert(account_holder ah) {
        try {
            Connection con = null;
            PreparedStatement ps = null;
            con = Getconnect.getconnect();
            String sql = "insert into account_holders values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
             ps.setString(1, ah.getNet_banking());
            ps.setLong(2, ah.getAccount_no());
            ps.setString(3, ah.getFirstname());
            ps.setString(4, ah.getLastname());
            ps.setString(5, ah.getDOB());
            ps.setString(6, ah.getAddress());
            ps.setString(7, ah.getPhonenumber());
            ps.setString(8, ah.getE_mail());
            ps.setLong(9, ah.getBalance());
            ps.setString(10, ah.getAcount_type());
           
            ps.executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public account_holder getaccountholder(String netbankingid) {
        account_holder ah = new account_holder(); 
        try {
            Connection con=null;
            PreparedStatement ps=null;
            con = Getconnect.getconnect();
            String sql = "SELECT * FROM account_holders WHERE Net_banking_id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, netbankingid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 ah.setNet_banking(rs.getString(1));
                ah.setAccount_no(rs.getLong(2));
                ah.setFirstname(rs.getString(3));
                ah.setLastname(rs.getString(4));
                ah.setDOB(rs.getString(5));
                ah.setAddress(rs.getString(6));
                ah.setPhonenumber(rs.getString(7));
                ah.setE_mail(rs.getString(8));
                ah.setBalance(rs.getLong(9));
                ah.setAcount_type(rs.getString(10));
                return ah;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ah; // Return the retrieved account_holder object
    }
    
    public void updateNetBankingId(account_holder ah)//Update the netbaking id into db while registrstion
    {
        try {
            Connection con;
            PreparedStatement ps;
            con = Getconnect.getconnect();
            String sql = "update account_holders set Net_banking_id=? where email=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ah.getNet_banking());
            ps.setString(2, ah.getE_mail());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<account_holder> searchallrecord() {
        ArrayList<account_holder> data = new ArrayList<account_holder>();
        try {
            Connection con;
            PreparedStatement ps;
            ResultSet rs = null;
            con = Getconnect.getconnect();
            String sql = "Select * from account_holders ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                account_holder ah = new account_holder();
                ah.setAccount_no(rs.getLong(1));
                ah.setFirstname(rs.getString(2));
                ah.setLastname(rs.getString(3));
                ah.setDOB(rs.getString(4));
                ah.setAddress(rs.getString(5));
                ah.setPhonenumber(rs.getString(6));
                ah.setE_mail(rs.getString(7));
                ah.setBalance(rs.getLong(8));
                ah.setAcount_type(rs.getString(9));
                ah.setNet_banking(rs.getString(10));
                data.add(ah);
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
    public void updatebalance(long balance,long account_number)
    {
        try{
            Connection con;
            PreparedStatement ps;
            con=Getconnect.getconnect();
            String sql=" update account_holders set balance=? where account_number=?";
            ps=con.prepareStatement(sql);
            ps.setLong(1, balance);
            ps.setLong(2, account_number);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
