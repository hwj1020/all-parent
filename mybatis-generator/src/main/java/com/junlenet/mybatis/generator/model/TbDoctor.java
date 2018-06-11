package com.junlenet.mybatis.generator.model;

import java.io.Serializable;
import java.util.Date;

public class TbDoctor implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 医院ID
     */
    private Long hospitalId;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 科室ID
     */
    private Long hospitalDeptId;

    /**
     * 科室名称
     */
    private String hospitalDeptName;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * token
     */
    private String token;

    /**
     * 微信ID
     */
    private String openId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 是否删除(1:是; 0:否)
     */
    private Integer isDelete;

    /**
     * tb_doctor
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     *
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     *
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 医院ID
     *
     * @return hospital_id 医院ID
     */
    public Long getHospitalId() {
        return hospitalId;
    }

    /**
     * 医院ID
     *
     * @param hospitalId 医院ID
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 医院名称
     *
     * @return hospital_name 医院名称
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 医院名称
     *
     * @param hospitalName 医院名称
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    /**
     * 科室ID
     *
     * @return hospital_dept_id 科室ID
     */
    public Long getHospitalDeptId() {
        return hospitalDeptId;
    }

    /**
     * 科室ID
     *
     * @param hospitalDeptId 科室ID
     */
    public void setHospitalDeptId(Long hospitalDeptId) {
        this.hospitalDeptId = hospitalDeptId;
    }

    /**
     * 科室名称
     *
     * @return hospital_dept_name 科室名称
     */
    public String getHospitalDeptName() {
        return hospitalDeptName;
    }

    /**
     * 科室名称
     *
     * @param hospitalDeptName 科室名称
     */
    public void setHospitalDeptName(String hospitalDeptName) {
        this.hospitalDeptName = hospitalDeptName == null ? null : hospitalDeptName.trim();
    }

    /**
     * 联系方式
     *
     * @return mobile 联系方式
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 联系方式
     *
     * @param mobile 联系方式
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * token
     *
     * @return token token
     */
    public String getToken() {
        return token;
    }

    /**
     * token
     *
     * @param token token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 微信ID
     *
     * @return open_id 微信ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信ID
     *
     * @param openId 微信ID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 创建时间
     *
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     *
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 修改时间
     *
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 修改人
     *
     * @return update_by 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     *
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 是否删除(1:是; 0:否)
     *
     * @return is_delete 是否删除(1:是; 0:否)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除(1:是; 0:否)
     *
     * @param isDelete 是否删除(1:是; 0:否)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}