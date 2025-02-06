# GoKV-TCP-JavaClient
GoKV-TCP-JavaClient is a simple Key-Value Store running on a Go TCP server, which can be controlled via a Java client. This project allows key-value data to be stored, retrieved, updated, and deleted over a TCP connection.

This is an older project that I recently uploaded to GitHub. It is based on one of my previous repositories, tcp-LAN, which was a basic TCP server written in Golang. This project builds upon that foundation by adding key-value storage and a corresponding Java client.

### How to use:
```
cd server/
go run main.go
run Java (in (I/P)DE, terminal or as a Jar File doesn't matter
```
### notes:
- already a usability java file for basic use (aka the only use atp)
- it uses json as form of communication (not security proof)
- it was a small side project of my internship
