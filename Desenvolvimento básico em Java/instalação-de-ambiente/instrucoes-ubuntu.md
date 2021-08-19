# Instalação de ambiente

## Instalando o Java 11 - Versão mais recente

### Java Runtime Environment (JRE)

$ sudo apt update
$ sudo apt install default-jre
$ java -version


### Java Development Kit (JDK)

$ sudo apt install default-jdk
$ javac -version

## Ferramentas de build

### Gradle
+ https://gradle.org/

- versão 7.1.1
- Popular (Android Studio)
- Usa a linguagem de programação Groovy

$ mkdir /opt/gradle
$ unzip -d /opt/gradle gradle-7.1.1-bin.zip
$ ls /opt/gradle/gradle-7.1.1
$ export PATH=$PATH:/opt/gradle/gradle-7.1.1/bin

$ gradle -v
