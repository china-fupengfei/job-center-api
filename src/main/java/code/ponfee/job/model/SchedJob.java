package code.ponfee.job.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 调度任务实体类
 * @author: fupf
 */
public class SchedJob implements Serializable {
    private static final long serialVersionUID = -8101980833627039097L;
    public static final int STATUS_STOP = 0;
    public static final int STATUS_START = 1;

    /** 配置信息 */
    private int id; // 编号
    private String name; // 名称
    private String cronExpression; // cron表达式
    private String handler; // 任务处理者
    private Integer status; // 状态：0停止；1启动；
    private Boolean concurrentSupport; // 是否支持并发执行：0不支持；1支持；
    private Boolean recoverySupport; // 是否支持恢复执行：0不支持；1支持；
    private Integer score; // 权重分数
    private String execParams; // 执行参数
    private Date startTime; // 任务开始时间（为空不限制）
    private Date endTime; // 任务结束时间（为空不限制）
    private String remark; // 备注

    /** 调度信息：手动触发不作记录 */
    private Boolean isExecuting; // 是否正在执行：0否；1是；
    private Long execingTimeMillis; // 本次执行时间（毫秒）
    private Date lastSchedTime; // 上一次的调度时间
    private String lastSchedServer; // 上一次的调度服务器IP
    private Date nextSchedTime; // 下一次的调度时间

    /** 后台管理信息 */
    private Long creatorId; // 创建人id
    private String creatorName; // 创建人姓名
    private Date createTime; // 创建时间
    private Long modifierId; // 最近修改人id
    private String modifierName; // 最近修改人姓名
    private Date modifyTime; // 最近修改时间
    private int version; // 版本号

    public SchedJob() {}

    public SchedJob(int id, int version) {
        this.id = id;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getConcurrentSupport() {
        return concurrentSupport;
    }

    public void setConcurrentSupport(Boolean concurrentSupport) {
        this.concurrentSupport = concurrentSupport;
    }

    public Boolean getRecoverySupport() {
        return recoverySupport;
    }

    public void setRecoverySupport(Boolean recoverySupport) {
        this.recoverySupport = recoverySupport;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getExecParams() {
        return execParams;
    }

    public void setExecParams(String execParams) {
        this.execParams = execParams;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getIsExecuting() {
        return isExecuting;
    }

    public void setIsExecuting(Boolean isExecuting) {
        this.isExecuting = isExecuting;
    }

    public Long getExecingTimeMillis() {
        return execingTimeMillis;
    }

    public void setExecingTimeMillis(Long execingTimeMillis) {
        this.execingTimeMillis = execingTimeMillis;
    }

    public Date getLastSchedTime() {
        return lastSchedTime;
    }

    public void setLastSchedTime(Date lastSchedTime) {
        this.lastSchedTime = lastSchedTime;
    }

    public String getLastSchedServer() {
        return lastSchedServer;
    }

    public void setLastSchedServer(String lastSchedServer) {
        this.lastSchedServer = lastSchedServer;
    }

    public Date getNextSchedTime() {
        return nextSchedTime;
    }

    public void setNextSchedTime(Date nextSchedTime) {
        this.nextSchedTime = nextSchedTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
