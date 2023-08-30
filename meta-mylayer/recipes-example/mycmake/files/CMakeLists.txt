cmake_minimum_required(VERSION 3.20)

project(userprog)
add_executable(userprog userprog.c)
install(TARGETS userprog DESTINATION bin)
