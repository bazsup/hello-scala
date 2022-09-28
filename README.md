
## Install
```
sdk install sbt
```

## VS Code Extension

- Scala (metals)
  - ทำให้เราใช้ scala worksheet ได้ เหมือนเราเขียน python

## SBT Console

```bash
$ sbt console
```

repl (repeat eval print loop)
```scala
scala> println("hello World")
```
exit ctrl+D

```
:paste

ctrl+p
ctrl+d
```

เขียน Scala ไม่ยากแค่มี SBT

## Scala

Build version

```sbt
// build.sbt
scalaVersion := "2.13.8"
// version 3 คนละเรื่องเลย
```

Worksheet
- 

Entry Point

main class -> EntryPoint
```bash
sbt run
```

Watch change
```
$ sbt
sbt:hello-scala> ~run
```



## Why scala
- Martin Odersky, Creator of Scala
  - คิดว่า Java เคลื่อนที่ไปช้ามาก เพราะ เรื่อง backward compatibility
  - proof ว่าของที่อยู่ในหนังสือ ในตำรา สามารถมาใช้งานได้จริง
- ภาษามี mindset ให้เราคิดเรื่อง type ที่ดี
  - ในหน่วยที่เล็กทีสุดดี
  - architecture ใหญ่ก็จะดีไปด้วย

## Book
สร้างโลกได้ด้วย SBT