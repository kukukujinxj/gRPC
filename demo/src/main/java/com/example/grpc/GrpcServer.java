package com.example.grpc;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

/**
 * @author zw_jxj
 * @ClassName GrpcServer
 * @date 2020/10/30
 * @description:
 */
public class GrpcServer {
    public static void main(String[] args) {
        try {
            Server server = NettyServerBuilder.forPort(50051).addService(new HelloServiceImpl()).build().start();
            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
