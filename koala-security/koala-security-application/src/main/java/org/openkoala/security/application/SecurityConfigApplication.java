package org.openkoala.security.application;

import java.util.List;
import java.util.Set;

import org.openkoala.security.core.domain.Actor;
import org.openkoala.security.core.domain.Authority;
import org.openkoala.security.core.domain.MenuResource;
import org.openkoala.security.core.domain.OrganizationScope;
import org.openkoala.security.core.domain.PageElementResource;
import org.openkoala.security.core.domain.Permission;
import org.openkoala.security.core.domain.Role;
import org.openkoala.security.core.domain.Scope;
import org.openkoala.security.core.domain.SecurityResource;
import org.openkoala.security.core.domain.User;

public interface SecurityConfigApplication {

	/**
	 * 
	 * @param actor
	 */
	void terminateActor(Actor actor);

	void updateActor(Actor actor);

	/**
	 * 
	 * @param user
	 */
	void suspendUser(User user);

	/**
	 * 
	 * @param user
	 */
	void activateUser(User user);

	/**
	 * 
	 * @param authority
	 */
	void createAuthority(Authority authority);

	/**
	 * 
	 * @param authority
	 */
	void updateAuthority(Authority authority);

	/**
	 * 
	 * @param authority
	 */
	void terminateAuthority(Authority authority);

	/**
	 * 
	 * @param securityResource
	 */
	void createSecurityResource(SecurityResource securityResource);

	/**
	 * 
	 * @param securityResource
	 */
	void updateSecurityResource(SecurityResource securityResource);

	/**
	 * 
	 * @param securityResource
	 */
	void terminateSecurityResource(SecurityResource securityResource);

	/**
	 * 
	 * @param authority
	 * @param securityResource
	 */
	void grantAuthorityToSecurityResource(Authority authority, SecurityResource securityResource);

	/**
	 * 
	 * @param authority
	 * @param securityResources
	 */
	void grantAuthorityToSecurityResources(Authority authority, List<? extends SecurityResource> securityResources);

	/**
	 * 
	 * @param authorities
	 * @param securityResource
	 */
	void grantAuthoritiesToSecurityResource(List<Authority> authorities, SecurityResource securityResource);

	/**
	 * 
	 * @param role
	 * @param permission
	 */
	void grantRoleToPermission(Role role, Permission permission);

	/**
	 * 
	 * @param role
	 * @param permission
	 */
	void grantRoleToPermissions(Role role, List<Permission> permission);

	/**
	 * 
	 * @param roles
	 * @param permission
	 */
	void grantRolesToPermission(List<Role> roles, Permission permission);

	/**
	 * 
	 * @param actor
	 * @param authorities
	 */
	void grantActorToAuthorities(Actor actor, List<Authority> authorities);

	/**
	 * 
	 * @param actors
	 * @param authority
	 */
	void grantActorsToAuthority(List<Actor> actors, Authority authority);

	/**
	 * 
	 * @param securityResource
	 * @param authority
	 */
	void terminateSecurityResourceFromAuthority(SecurityResource securityResource, Authority authority);

	/**
	 * 
	 * @param securityResources
	 * @param authority
	 */
	void terminateSecurityResourcesFromAuthority(List<? extends SecurityResource> securityResources, Authority authority);

	/**
	 * 
	 * @param authorities
	 * @param securityResource
	 */
	void terminateAuthoritiesFromSecurityResource(List<Authority> authorities, SecurityResource securityResource);

	/**
	 * 
	 * @param authorities
	 * @param securityResource
	 */
	void terminateAuthorityFromSecurityResource(Authority authority, SecurityResource securityResource);

	/**
	 * 
	 * @param permission
	 * @param role
	 */
	void terminatePermissionFromRole(Permission permission, Role role);

	/**
	 * 
	 * @param permissions
	 * @param role
	 */
	void terminatePermissionsFromRole(List<Permission> permissions, Role role);

	/**
	 * 
	 * @param roles
	 * @param permission
	 */
	void terminateRolesFromPermission(List<Role> roles, Permission permission);

	/**
	 * 
	 * @param actor
	 * @param authority
	 */
	void terminateActorFromAuthority(Actor actor, Authority authority);

	/**
	 * 
	 * @param authorities
	 * @param actor
	 */
	void terminateAuthoritiesFromActor(List<Authority> authorities, Actor actor);

	/**
	 * 
	 * @param menuResources
	 */
	void updateMenuResources(List<MenuResource> menuResources);

	boolean isSecurityResourceEmpty();

	/**
	 * 
	 * @param securityResource
	 */
	boolean isSecurityResourceNameExist(SecurityResource securityResource);

	/**
	 * 
	 * @param securityResource
	 */
	boolean isSecurityResourceIdentifierExist(SecurityResource securityResource);

	/**
	 * 初始化权限数据
	 */
	void initSecuritySystem();

	/***
	 * TODO 1、判断账户是否存在 ； 2、判断邮箱是否存在 ； 3、判断电话是否已经存在 。 添加参与者
	 * 
	 * @param actor
	 */
	void createActor(Actor actor);

	/**
	 * 创建范围
	 * 
	 * @param scope
	 */
	void createScope(Scope scope);

	/**
	 * 在某个范围下对Actor进行authority的授权
	 * 
	 * @param actor
	 * @param authority
	 * @param scope
	 */
	void grantActorToAuthorityInScope(Actor actor, Authority authority, Scope scope);

	/**
	 * 重置密码
	 * 
	 * @param user
	 */
	void resetPassword(User user);

	/**
	 * @param child
	 * @param parentId
	 */
	void createChildToParent(MenuResource child, Long parentId);

	void updateScope(Scope scope);

	void terminateScope(Scope scope);

	void createChildToParent(OrganizationScope child, Long parentId);

	/**
	 * 为可授权体:Authority授予多个权限资源:SecurityResources。
	 * 
	 * @param securityResources
	 * @param authority
	 */
	void grantSecurityResourcesToAuthority(List<? extends SecurityResource> securityResources, Authority authority);

	/**
	 * 为可授权体:Authority授予一个权限资源:SecurityResources。
	 * 
	 * @param securityResource
	 * @param authority
	 */
	void grantSecurityResourceToAuthority(SecurityResource securityResource, Authority authority);

	/**
	 * 为角色授予一个权限。
	 * 
	 * @param permission
	 *            权限
	 * @param role
	 *            角色
	 */
	void grantPermissionToRole(Permission permission, Role role);

	/**
	 * 为角色授权多个权限Permission
	 * 
	 * @param permissions
	 * @param adminRole
	 */
	void grantPermissionsToRole(List<Permission> permissions, Role role);

	boolean checkAuthoritiHasPageElementResource(Set<Authority> authorities, PageElementResource pageElementResource);

	/**
	 * 为参与者授权授权体
	 * 
	 * @param authority
	 * @param actor
	 */
	void grantAuthorityToActor(Authority authority, Actor actor);

}