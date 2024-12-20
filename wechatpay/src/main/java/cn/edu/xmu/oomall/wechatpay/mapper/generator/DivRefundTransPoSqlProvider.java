package cn.edu.xmu.oomall.wechatpay.mapper.generator;

import cn.edu.xmu.oomall.wechatpay.mapper.generator.po.DivRefundTransPo;
import cn.edu.xmu.oomall.wechatpay.mapper.generator.po.DivRefundTransPoExample.Criteria;
import cn.edu.xmu.oomall.wechatpay.mapper.generator.po.DivRefundTransPoExample.Criterion;
import cn.edu.xmu.oomall.wechatpay.mapper.generator.po.DivRefundTransPoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DivRefundTransPoSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    public String insertSelective(DivRefundTransPo row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("wechatpay_div_refund_trans");
        
        if (row.getId() != null) {
            sql.VALUES("`id`", "#{id,jdbcType=BIGINT}");
        }
        
        if (row.getSubMchid() != null) {
            sql.VALUES("`sub_mchid`", "#{subMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getOrderId() != null) {
            sql.VALUES("`order_id`", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (row.getOutOrderNo() != null) {
            sql.VALUES("`out_order_no`", "#{outOrderNo,jdbcType=VARCHAR}");
        }
        
        if (row.getOutReturnNo() != null) {
            sql.VALUES("`out_return_no`", "#{outReturnNo,jdbcType=VARCHAR}");
        }
        
        if (row.getReturnMchid() != null) {
            sql.VALUES("`return_mchid`", "#{returnMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getAmount() != null) {
            sql.VALUES("`amount`", "#{amount,jdbcType=INTEGER}");
        }
        
        if (row.getDescription() != null) {
            sql.VALUES("`description`", "#{description,jdbcType=VARCHAR}");
        }
        
        if (row.getResult() != null) {
            sql.VALUES("`result`", "#{result,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateTime() != null) {
            sql.VALUES("`create_time`", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFinishTime() != null) {
            sql.VALUES("`finish_time`", "#{finishTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    public String selectByExample(DivRefundTransPoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("`id`");
        } else {
            sql.SELECT("`id`");
        }
        sql.SELECT("`sub_mchid`");
        sql.SELECT("`order_id`");
        sql.SELECT("`out_order_no`");
        sql.SELECT("`out_return_no`");
        sql.SELECT("`return_mchid`");
        sql.SELECT("`amount`");
        sql.SELECT("`description`");
        sql.SELECT("`return_id`");
        sql.SELECT("`result`");
        sql.SELECT("`create_time`");
        sql.SELECT("`finish_time`");
        sql.FROM("wechatpay_div_refund_trans");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        DivRefundTransPo row = (DivRefundTransPo) parameter.get("row");
        DivRefundTransPoExample example = (DivRefundTransPoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("wechatpay_div_refund_trans");
        
        if (row.getId() != null) {
            sql.SET("`id` = #{row.id,jdbcType=BIGINT}");
        }
        
        if (row.getSubMchid() != null) {
            sql.SET("`sub_mchid` = #{row.subMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getOrderId() != null) {
            sql.SET("`order_id` = #{row.orderId,jdbcType=VARCHAR}");
        }
        
        if (row.getOutOrderNo() != null) {
            sql.SET("`out_order_no` = #{row.outOrderNo,jdbcType=VARCHAR}");
        }
        
        if (row.getOutReturnNo() != null) {
            sql.SET("`out_return_no` = #{row.outReturnNo,jdbcType=VARCHAR}");
        }
        
        if (row.getReturnMchid() != null) {
            sql.SET("`return_mchid` = #{row.returnMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getAmount() != null) {
            sql.SET("`amount` = #{row.amount,jdbcType=INTEGER}");
        }
        
        if (row.getDescription() != null) {
            sql.SET("`description` = #{row.description,jdbcType=VARCHAR}");
        }
        
        if (row.getReturnId() != null) {
            sql.SET("`return_id` = #{row.returnId,jdbcType=VARCHAR}");
        }
        
        if (row.getResult() != null) {
            sql.SET("`result` = #{row.result,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateTime() != null) {
            sql.SET("`create_time` = #{row.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFinishTime() != null) {
            sql.SET("`finish_time` = #{row.finishTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("wechatpay_div_refund_trans");
        
        sql.SET("`id` = #{row.id,jdbcType=BIGINT}");
        sql.SET("`sub_mchid` = #{row.subMchid,jdbcType=VARCHAR}");
        sql.SET("`order_id` = #{row.orderId,jdbcType=VARCHAR}");
        sql.SET("`out_order_no` = #{row.outOrderNo,jdbcType=VARCHAR}");
        sql.SET("`out_return_no` = #{row.outReturnNo,jdbcType=VARCHAR}");
        sql.SET("`return_mchid` = #{row.returnMchid,jdbcType=VARCHAR}");
        sql.SET("`amount` = #{row.amount,jdbcType=INTEGER}");
        sql.SET("`description` = #{row.description,jdbcType=VARCHAR}");
        sql.SET("`return_id` = #{row.returnId,jdbcType=VARCHAR}");
        sql.SET("`result` = #{row.result,jdbcType=VARCHAR}");
        sql.SET("`create_time` = #{row.createTime,jdbcType=TIMESTAMP}");
        sql.SET("`finish_time` = #{row.finishTime,jdbcType=TIMESTAMP}");
        
        DivRefundTransPoExample example = (DivRefundTransPoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(DivRefundTransPo row) {
        SQL sql = new SQL();
        sql.UPDATE("wechatpay_div_refund_trans");
        
        if (row.getSubMchid() != null) {
            sql.SET("`sub_mchid` = #{subMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getOrderId() != null) {
            sql.SET("`order_id` = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (row.getOutOrderNo() != null) {
            sql.SET("`out_order_no` = #{outOrderNo,jdbcType=VARCHAR}");
        }
        
        if (row.getOutReturnNo() != null) {
            sql.SET("`out_return_no` = #{outReturnNo,jdbcType=VARCHAR}");
        }
        
        if (row.getReturnMchid() != null) {
            sql.SET("`return_mchid` = #{returnMchid,jdbcType=VARCHAR}");
        }
        
        if (row.getAmount() != null) {
            sql.SET("`amount` = #{amount,jdbcType=INTEGER}");
        }
        
        if (row.getDescription() != null) {
            sql.SET("`description` = #{description,jdbcType=VARCHAR}");
        }
        
        if (row.getReturnId() != null) {
            sql.SET("`return_id` = #{returnId,jdbcType=VARCHAR}");
        }
        
        if (row.getResult() != null) {
            sql.SET("`result` = #{result,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateTime() != null) {
            sql.SET("`create_time` = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getFinishTime() != null) {
            sql.SET("`finish_time` = #{finishTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("`id` = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatpay_div_refund_trans
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, DivRefundTransPoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}