package code.ponfee.job.service;

import java.util.Map;

import code.ponfee.job.model.SchedJob;
import code.ponfee.job.model.SchedLog;
import code.ponfee.commons.model.Pagination;
import code.ponfee.commons.model.Result;

/**
 * 任务调度服务类
 * @author fupf
 */
public interface ISchedJobService {

    /**
     * 分页查询调度列表
     * 
     * <pre>
     *  <ur>
     *   <li>jobId    任务id</li>
     *   <li>jobName  任务名称</li>
     *   <li>status   任务状态（int类型，可不传）：0停止；1启动；</li>
     *   <li>pageNum  分页页码（int）</li>
     *   <li>pageSize 分页大小（int）</li>
     *  </ur>
     * </pre>
     * @param params
     * @return
     */
    Result<Pagination<SchedJob>> queryJobsForPage(Map<String, ?> params);

    /**
     * 增加调度任务
     * @param job
     * @return
     */
    Result<Integer> addJob(SchedJob job);

    /**
     * 获取调度任务
     * @param jobId
     * @return
     */
    Result<SchedJob> getJob(int jobId);

    /**
     * 删除调度任务
     * @param jobId
     * @param version
     * @return
     */
    Result<Void> delJob(int jobId, int version);

    /**
     * 更新调度任务
     * @param job
     * @return
     */
    Result<Void> updJob(SchedJob job);

    /**
     * 启动任务
     * @param jobId
     * @param version
     * @return
     */
    Result<Void> startJob(int jobId, int version);

    /**
     * 停止任务
     * @param jobId
     * @param version
     * @return
     */
    Result<Void> stopJob(int jobId, int version);

    /**
     * 触发执行一次
     * @param jobId
     * @return
     */
    Result<Void> triggerJob(int jobId);

    /**
     * 日志查询
     * 
     * <pre>
     *  <ur>
     *   <li>execServer       服务器ip</li>
     *   <li>isSuccess        是否执行成功（int）：0否；1是；</li>
     *   <li>isManualTrigger  是否手动执行（int）：0否；1是；</li>
     *   <li>jobId            任务id</li>
     *   <li>jobName          任务名称</li>
     *   <li>beginTime        日志记录时间范围（Date，可不传）</li>
     *   <li>endTime          日志记录时间范围（Date，可不传）</li>
     *   <li>pageNum          分页页码（int）</li>
     *   <li>pageSize         分页大小（int）</li>
     *  </ur>
     * </pre>
     * @param params
     * @return
     */
    Result<Pagination<SchedLog>> queryLogsForPage(Map<String, ?> params);
}
