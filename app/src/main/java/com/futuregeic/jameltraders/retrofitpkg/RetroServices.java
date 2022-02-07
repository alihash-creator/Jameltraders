//package com.futuregeic.jameltraders.retrofitpkg;
//
//import retrofit2.http.Field;
//
//public interface RetroServices {
//
//    @FormUrlEncoded
//    @Headers({
//            "Accept: application/json",
//            "X-Requested-With: XMLHttpRequest"})
//    @POST("singup")
//    Call<MDRegister> register(@Field("first_name") String first_name,
//                              @Field("last_name") String last_name,
//                              @Field("dob") String dob,
//                              @Field("gender") String gender,
//                              @Field("institute_id") String institute_id,
//                              @Field("ph_num") String ph_num,
//                              @Field("email") String email,
//                              @Field("password") String password);
//
//    @FormUrlEncoded
//    @Headers({
//            "Accept: application/json",
//            "X-Requested-With: XMLHttpRequest"})
//    @POST("login")
//    Call<MDLogin> loginEmail(@Field("username") String email,
//                             @Field("password") String password);
//
//}
