package com.example.grpc;

import com.example.grpc.gencode.HelloRequest;
import com.example.grpc.gencode.HelloResponse;
import com.example.grpc.gencode.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author zw_jxj
 * @ClassName HelloServiceImpl
 * @date 2020/10/30
 * @description:
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String greeting = new StringBuilder().append("Hello, ").append(request.getFirstName()).append(" ").append(request.getLastName()).toString();
        HelloResponse response = HelloResponse.newBuilder().setGreeting(greeting).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
