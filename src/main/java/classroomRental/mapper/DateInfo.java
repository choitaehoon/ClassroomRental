package classroomRental.mapper;

import java.util.List;

import classroomRental.dto.DateDto;

public interface DateInfo 
{
	int selectByCurrentTime(DateDto dateDto);
	List<String> selectByIdDate(DateDto dateDto);
	void selectByInsert(DateDto dateDto);
	List<DateDto> selectByAll(int id);
	List<DateDto> selectAllRoom();
	void updateApprovalSubmit(DateDto dateDto);
	void updateApprovalReject(DateDto dateDto);

}
