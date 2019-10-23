package com.wenyiroad.xblog.remote;

import com.wenyiroad.xblog.model.TbUser;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


import java.util.List;


public interface LabelAnalysisClient {

    /**
     * 查询客群对应的会员列表
     *  取标签下的会员id的并集
     * @param membersReq
     * @return
     */
    @POST("/label/customers/get_cur_customer_group_infor")
    Call<TbUser> getMembers(@Body TbUser membersReq);

    /**
     * 获取同时拥有n个标签的会员
     * 取标签下的会员id的交集
     * @param membersReq
     * @return
     */
    @POST("/label/customers/get_memberId_intersection")
    Call<TbUser> getIntersectionMembers(@Body TbUser membersReq);

    /**
     * 批量查询客群对应的人数
     *
     * @param labelInfors
     * @return
     */
    @POST("/label/customers/get_customer_num")
    Call<TbUser> getLabelsCount(@Body List<TbUser> labelInfors);

    /**
     * 查询比例最高的20个标签
     *
     * @param relatedLabels
     * @return
     */
    @POST("/label/customers/get_customer_top_label")
    Call<TbUser> getTopLabels(@Body List<TbUser> relatedLabels);

    /**
     * 给会员打标签
     *
     * @param tag2MemberReq
     * @return
     */
    @POST("/label/member/send_handle_label_result")
    Call<TbUser> tag2Member(@Body TbUser tag2MemberReq);

    /**
     * 给会员去标签
     *  去掉手动标签 isAuto=0，isSystem=0
     * @param cancelTag2MemberReq
     * @return
     */
    @POST("/label/member/del_handle_label")
    Call<TbUser> cancelTag2Member(@Body TbUser cancelTag2MemberReq);

    /**
     * 获取会员标签
     *
     * @param memberTagsReq
     * @return
     */
    @POST("/label/member/get_member_label_info")
    Call<TbUser> getMemberTags(@Body TbUser memberTagsReq);

    /**
     * 是自动标签时。标签同步方法
     *
     * @param labelSynReq
     * @return
     */
    @POST("/label/rule/rule_op")
    Call<TbUser> synAutoLabel(@Body TbUser labelSynReq);

    /**
     * 不是自动标签时。标签同步方法
     *
     * @param labelSynReq
     * @return
     */
    @POST("/label/rule/op_hand_label")
    Call<TbUser> synLabel(@Body TbUser labelSynReq);


    /**
     * 根据客群获取营销次数和支付转换率
     * @param labelGroupId 客群id
     * @return
     */
    @GET("/api/label/market/pay/get")
    Call<TbUser> getMarketingTimesAndPayResp(@Query("labelGroupId") String labelGroupId);




    @POST("/label/rule/op_model_label")
    Call<TbUser> modelLabelOpt(@Body TbUser modelRule);

    @POST("/label/customers/get_customer_value_distribution")
    Call<TbUser> getValueDistribution(@Body TbUser valueDistributionReq);
}
