package org.openkoala.opencis.trac.command;

import org.openkoala.opencis.api.Project;

import com.dayatang.configuration.Configuration;

/**
 * Trac分配用户到某个角色
 * @author 赵健华
 * 2013-9-23 下午8:52:24
 */
public class TracAssignUserToRoleCommand extends TracCommand {

	private String usrId;
	
	private String role;
	
	public TracAssignUserToRoleCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public TracAssignUserToRoleCommand(String usrId, String role, Configuration configuration,Project project){
		super(configuration, project);
		this.usrId = usrId;
		this.role = role;
	}
	
	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		String createRoleCommand = "trac-admin " + project.getProjectPath() + " permission add " + usrId + " " + role;
		return createRoleCommand;
	}

}