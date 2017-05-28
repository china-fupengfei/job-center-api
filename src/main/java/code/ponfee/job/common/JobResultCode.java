package code.ponfee.job.common;

import static code.ponfee.commons.model.ResultCode.create;

import code.ponfee.commons.model.ResultCode;

/**
 * -101001 ~ -102000
 * @author fupf
 */
public interface JobResultCode {
    ResultCode JOB_NOT_FOUND = create(-101001, "任务不存在");
    ResultCode INVALID_CRON_EXP = create(-101002, "无效的时间表达式");
    ResultCode INVALID_JOB_HANDLER = create(-101003, "无效的任务处理器");
    ResultCode INVALID_EXEC_PARAMS = create(-101004, "无效的调度参数");
    ResultCode JOB_BEING_TRIGGER = create(-101005, "任务已经触发，请稍后再试！");
}
