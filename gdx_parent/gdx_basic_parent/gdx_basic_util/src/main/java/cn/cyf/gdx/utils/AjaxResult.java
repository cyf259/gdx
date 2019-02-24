package cn.cyf.gdx.utils;

/**
 * @author cyf
 * @date 2019/2/23 13:25
 * @description
 */
public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";
    private Object object;
    public static AjaxResult me() {
        return new AjaxResult();
    }

    public AjaxResult() {
    }

    public AjaxResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
