package code.ponfee.job.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 调度日志
 * @author: fupf
 */
public class SchedLog implements Serializable {
    private static final long serialVersionUID = 2520801190208386818L;

    private long id; // 主键id
    private String execServer; // 执行服务器IP
    private boolean isSuccess; // 是否成功：0否；1是；
    private boolean isManualTrigger; // 是否手动触发执行：0否；1是；
    private int jobId; // 任务ID
    private String jobName; // 任务名称
    private String execParams; // 执行参数
    private Date schedTime; // 调度时间（为空表示手动触发执行）
    private Date execStartTime; // 执行开始时间
    private Date execEndTime; // 执行结束时间
    private String exception; // 异常信息
    private Date createTime; // 创建时间

    public SchedLog() {}

    public SchedLog(String execServer, boolean isSuccess, boolean isManualTrigger, int jobId, String jobName,
        String execParams, Date schedTime, Date execStartTime, Date execEndTime, String exception) {
        this.execServer = execServer;
        this.isSuccess = isSuccess;
        this.isManualTrigger = isManualTrigger;
        this.jobId = jobId;
        this.jobName = jobName;
        this.execParams = execParams;
        this.schedTime = schedTime;
        this.execStartTime = execStartTime;
        this.execEndTime = execEndTime;
        this.exception = exception;
        this.createTime = new Date();
    }

    public long getId() {
        return id;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public boolean isManualTrigger() {
        return isManualTrigger;
    }

    public int getJobId() {
        return jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public String getExecParams() {
        return execParams;
    }

    public Date getSchedTime() {
        return schedTime;
    }

    public Date getExecStartTime() {
        return execStartTime;
    }

    public Date getExecEndTime() {
        return execEndTime;
    }

    public String getException() {
        return exception;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setManualTrigger(boolean isManualTrigger) {
        this.isManualTrigger = isManualTrigger;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setExecParams(String execParams) {
        this.execParams = execParams;
    }

    public void setSchedTime(Date schedTime) {
        this.schedTime = schedTime;
    }

    public void setExecStartTime(Date execStartTime) {
        this.execStartTime = execStartTime;
    }

    public void setExecEndTime(Date execEndTime) {
        this.execEndTime = execEndTime;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getExecServer() {
        return execServer;
    }

    public void setExecServer(String execServer) {
        this.execServer = execServer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
