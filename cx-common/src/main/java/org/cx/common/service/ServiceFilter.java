package org.cx.common.service;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import org.cx.common.util.RequestID;

public class ServiceFilter implements Filter{

	private String reqidKey = "ReqId";
	
	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		RpcContext context = RpcContext.getContext();
		boolean provider = context.isProviderSide();
		if (provider) {
			String reqId = invocation.getAttachment(reqidKey);
			RequestID.set(reqId);
		} else {
			String reqId = RequestID.get();
			invocation.getAttachments().put(reqidKey, reqId);
		}
		return invoker.invoke(invocation);
	}

}
