package notice.model.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class Notice {
	private int noticeNo;
	   private String noticeTitle;
	   private String noticeContents;
	   private Date noticeDate;
	   private String memberId;
	   private String noticeFilePath;
	   private long noticeFileSize;
	   private Timestamp noticeUploadTime;
	   private String fileName;

	   public Notice() {}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContents() {
		return noticeContents;
	}

	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getNoticeFilePath() {
		return noticeFilePath;
	}

	public void setNoticeFilePath(String noticeFilePath) {
		this.noticeFilePath = noticeFilePath;
	}

	public long getNoticeFileSize() {
		return noticeFileSize;
	}

	public void setNoticeFileSize(long noticeFileSize) {
		this.noticeFileSize = noticeFileSize;
	}

	public Timestamp getNoticeUploadTime() {
		return noticeUploadTime;
	}

	public void setNoticeUploadTime(Timestamp noticeUploadTime) {
		this.noticeUploadTime = noticeUploadTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeContents=" + noticeContents
				+ ", noticeDate=" + noticeDate + ", memberId=" + memberId + ", noticeFilePath=" + noticeFilePath
				+ ", noticeFileSize=" + noticeFileSize + ", noticeUploadTime=" + noticeUploadTime + ", fileName="
				+ fileName + "]";
	}
	   
}
