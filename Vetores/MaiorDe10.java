����   ; J  generation/MaiorDe10  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lgeneration/MaiorDe10; main ([Ljava/lang/String;)V  [[I  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	      out Ljava/io/PrintStream; " $Digite o valor da linha e da coluna:
 $ & % java/io/PrintStream ' ( println (Ljava/lang/String;)V
  * + , nextInt ()I . java/lang/StringBuilder 0 Números maiores que 10
 - 2  (
 - 4 5 6 append (I)Ljava/lang/StringBuilder;
 - 8 9 : toString ()Ljava/lang/String; args [Ljava/lang/String; linha I coluna vet contador li co leia Ljava/util/Scanner; StackMapTable < 
SourceFile MaiorDe10.java !               /     *� �    
                    	      g     v<=� N6� Y� � :6� ;6� ,� !� #-2� )O�-2.
� ����Ԅ��Ų � -Y/� 1� 3� 7� #�    
   >        	  
      &  .  :  =  I  L  U  ^  u     R    v ; <    t = >   r ? >   k @    h A >   Y B >  # 5 C >   \ D E  F   C �    G     �   G    %�   G       H    I