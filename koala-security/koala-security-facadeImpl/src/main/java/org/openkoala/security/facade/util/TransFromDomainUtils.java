package org.openkoala.security.facade.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openkoala.security.core.domain.MenuResource;
import org.openkoala.security.core.domain.OrganizationScope;
import org.openkoala.security.core.domain.Permission;
import org.openkoala.security.core.domain.Role;
import org.openkoala.security.core.domain.UrlAccessResource;
import org.openkoala.security.core.domain.User;
import org.openkoala.security.facade.dto.MenuResourceDTO;
import org.openkoala.security.facade.dto.OrganizationScopeDTO;
import org.openkoala.security.facade.dto.PermissionDTO;
import org.openkoala.security.facade.dto.RoleDTO;
import org.openkoala.security.facade.dto.UrlAccessResourceDTO;
import org.openkoala.security.facade.dto.UserDTO;

/**
 * 转换领域工具类
 * 
 * @author luzhao
 * 
 */
public final class TransFromDomainUtils {

	/**
	 * UserDto转换成User
	 * 
	 * @param userDTO
	 * @return
	 */
	public static User transFromUserBy(UserDTO userDTO) {
		User result = new User(userDTO.getUserAccount(), userDTO.getUserPassword(), userDTO.getEmail(),
				userDTO.getTelePhone());
		if (!StringUtils.isBlank(userDTO.getId() + "")) {
			result.setId(userDTO.getId());
		}
		result.setName(userDTO.getName());
		result.setDescription(userDTO.getDescription());
		return result;
	}

	public static Role transFromRoleBy(RoleDTO roleDTO) {
		Role result = new Role(roleDTO.getRoleName());
		if (!StringUtils.isBlank(roleDTO.getRoleId() + "")) {
			result.setId(roleDTO.getRoleId());
		}
		result.setDescription(roleDTO.getDescription());
		return result;
	}

	public static Permission transFromPermissionBy(PermissionDTO permissionDTO) {
		Permission result = new Permission(permissionDTO.getPermissionName(), permissionDTO.getIdentifier());
		if (!StringUtils.isBlank(permissionDTO.getPermissionId() + "")) {
			result.setId(permissionDTO.getPermissionId());
		}
		result.setDescription(permissionDTO.getDescription());
		return result;
	}

	public static MenuResource transFromMenuResourceBy(MenuResourceDTO menuResourceDTO) {
		MenuResource result = new MenuResource(menuResourceDTO.getName());
		if (!StringUtils.isBlank(menuResourceDTO.getId() + "")) {
			result.setId(menuResourceDTO.getId());
		}
		result.setDescription(menuResourceDTO.getDescription());
		result.setMenuIcon(menuResourceDTO.getIcon());
		result.setUrl(menuResourceDTO.getUrl());
		return result;
	}

	public static UrlAccessResource transFromUrlAccessResourceBy(UrlAccessResourceDTO urlAccessResourceDTO) {
		UrlAccessResource result = new UrlAccessResource(urlAccessResourceDTO.getName());
		result.setDescription(urlAccessResourceDTO.getDescription());
		if (!StringUtils.isBlank(urlAccessResourceDTO.getId() + "")) {
			result.setId(urlAccessResourceDTO.getId());
		}
		result.setUrl(urlAccessResourceDTO.getUrl());
		return result;
	}

	public static List<MenuResource> transFromMenuResourcesBy(List<MenuResourceDTO> menuResourceDTOs) {
		List<MenuResource> results = new ArrayList<MenuResource>();
		for (MenuResourceDTO menuResourceDTO : menuResourceDTOs) {
			results.add(transFromMenuResourceBy(menuResourceDTO));
		}
		return results;
	}

	public static OrganizationScope transFromOrganizationScopeBy(OrganizationScopeDTO organizationScopeDTO) {
		OrganizationScope result = new OrganizationScope(organizationScopeDTO.getName());
		if (!StringUtils.isBlank(organizationScopeDTO.getId() + "")) {
			result.setId(organizationScopeDTO.getId());
		}
		result.setDescription(organizationScopeDTO.getDescription());
		return result;
	}
}