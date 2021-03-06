package com.yfax.task.cfdb.dao;

import java.util.List;
import java.util.Map;

import com.yfax.task.cfdb.vo.UserTaskListVo;

public interface UserTaskListDao {
	public boolean selectCountIsExist(Map<Object, Object> map);
	public UserTaskListVo selectUserTaskListById(String id);
	public List<UserTaskListVo> selectUserTaskListByPhoneId(String phoneId);
	public boolean deleteUserTask(Map<Object, Object> map) throws Exception;
	public boolean updateIsChecked(Map<Object, Object> map) throws Exception;
	public boolean insertUserTask(UserTaskListVo userTaskListVo) throws Exception;
	public boolean updateUserTaskById(UserTaskListVo userTaskListVo) throws Exception;
	public List<UserTaskListVo> selectUserTaskListByTime();
}
