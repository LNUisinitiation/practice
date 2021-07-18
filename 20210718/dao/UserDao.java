/**
* All rights Reserved, Designed By www.chinasofti.com 
* @Title: UserDao.java
* @Package com.chinasofti.meetingsys.dao
* @Description: TODO(闁跨喐鏋婚幏铚傜闁跨喐鍨濈拠婵嬫晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喍鑼庣涵閿嬪闁跨喐鏋婚幏铚傜矆娑旓拷)
* @author: 闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹凤拷
* @date: 2021闁跨喐鏋婚幏锟�6闁跨喐鏋婚幏锟�19闁跨喐鏋婚幏锟� 闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�10:23:01
* @version V1.0
* @Copyright: 2021 www.chinasofti.com Inc. All rights reserved.
* 濞夈劑鏁撶憴锝忕窗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔稿祹閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐤唲闁跨喐鏋婚幏鐑芥晸娓氥儻缍囬幏鐑芥晸閺傘倖瀚瑰銏ゆ晸閺傘倖瀚瑰▔鍕晸閻ㄥ棛銆嬮幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹疯渹绗熼惄顕�鏁撻弬銈嗗
*/
package com.chinasofti.meetingsys.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.meetingsys.entity.User;

/**
 * @author Administrator
 *
 */
public class UserDao extends BaseDao{
	//闁跨喐鏋婚幏锟�//閸掞拷//闁跨喐鏋婚幏锟�//闁跨喐鏋婚幏锟� byId//闁跨喐鏋婚幏鐤嚄閸忋劑鏁撻弬銈嗗
	
	//闁跨喐鏋婚幏宄扮秿 
	//闁跨喐鏋婚幏鐤嚄 byUsername
	// ctrl+shift+o
	public User selectByUsername(String username){
		User user = null;
		String sql = "select * from user where username=?";
		try {
			//闁岸鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閹恒儴顔愰幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�
			PreparedStatement pst = getConn().prepareStatement(sql);
			//閹笛囨晸閺傘倖瀚规稊瀣闁跨喐鏋婚幏宄板弿sql闁跨喐鏋婚幏鐑芥晸閿燂拷
			pst.setString(1, username);
			//閹笛囨晸閺傘倖瀚箂ql闁跨喐鏋婚幏鐑芥晸閿燂拷   闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐕傛嫹
			ResultSet rs = pst.executeQuery();
			//闁跨喎褰ㄩ弬顓熸灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏閿嬬懞闁跨喐鏋婚幏鐑芥晸鐞涙鎷�
			if(rs.next()){
				user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			//闁跨喐鍩呴幉瀣闁跨喐鏋婚幏閿嬬爱
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	
	public int insertUser(User user){
		int num = 0;
		String sql = "insert into user values(null,?,?)";
		//闁岸鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閹恒儴顔愰幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�
		try {
			PreparedStatement pst = getConn().prepareStatement(sql);
			//閹笛囨晸閺傘倖瀚规稊瀣闁跨喐鏋婚幏宄板弿sql闁跨喐鏋婚幏鐑芥晸閿燂拷
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			//閹笛囨晸閺傘倖瀚箂ql闁跨喐鏋婚幏鐑芥晸閿燂拷
			num = pst.executeUpdate();
			System.out.println("闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐕傛嫹"+num +"闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹凤拷");
			//闁跨喐鍩呴幉瀣闁跨喐鏋婚幏閿嬬爱
			pst.close();
			closeConn();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	//闁跨喐鏋婚幏鐤嚄 byUsername
		// ctrl+shift+o
		public List<User> selectAllUser(){
			List<User> userlist = new ArrayList<User>();
			String sql = "select * from user";
			try {
				//闁岸鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閹恒儴顔愰幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�
				PreparedStatement pst = getConn().prepareStatement(sql);
				//閹笛囨晸閺傘倖瀚箂ql闁跨喐鏋婚幏鐑芥晸閿燂拷   闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐕傛嫹
				ResultSet rs = pst.executeQuery();
				//闁跨喎褰ㄩ弬顓熸灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏閿嬬懞闁跨喐鏋婚幏鐑芥晸鐞涙鎷�
				while(rs.next()){
					User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
					userlist.add(user);
				}
				//闁跨喐鍩呴幉瀣闁跨喐鏋婚幏閿嬬爱
				rs.close();
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return userlist;
		}
	
		public int updateUser(User user){
			int num = 0;
			String sql = "update user set username=?,password=? where userId=?";
			//闁岸鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閹恒儴顔愰幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�
			try {
				PreparedStatement pst = getConn().prepareStatement(sql);
				//閹笛囨晸閺傘倖瀚规稊瀣闁跨喐鏋婚幏宄板弿sql闁跨喐鏋婚幏鐑芥晸閿燂拷
				pst.setString(1, user.getUsername());
				pst.setString(2, user.getPassword());
				pst.setInt(3, user.getUserId());
				//閹笛囨晸閺傘倖瀚箂ql闁跨喐鏋婚幏鐑芥晸閿燂拷
				num = pst.executeUpdate();
				System.out.println("闁跨喓娼鹃棃鈺傚闁跨喐鏋婚幏锟�"+num+"闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹凤拷");
				//闁跨喐鍩呴幉瀣闁跨喐鏋婚幏閿嬬爱
				pst.close();
				closeConn();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return num;
		}
	
	//濞夈劑鏁撻弬銈嗗
	//闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�
	//main   alt+/
	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		User user = userdao.selectByUsername("lisi");
		System.out.println("ok");
		System.out.println(user);
		
		User user2 = new User(1,"wangbingbing","1234567");
		userdao.insertUser(user2);
		
		int number = userdao.updateUser(user2);
		System.out.println("中文" + number);
		
//		//杈撳嚭鎵�鏈夌敤鎴蜂俊鎭�
//		List<User> user3 = userdao.selectAllUser();
//		System.out.println(user3);
	}
}
