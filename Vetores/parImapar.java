����   ; N  generation/parImapar  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lgeneration/parImapar; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite um valor: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . Numeros pares: 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder;
 + 6 7 8 toString ()Ljava/lang/String; : Numeros Impares:  < "A soma de todos os números pares  > Quantidade de números impares  args [Ljava/lang/String; vet [I par I qtdipar y ler Ljava/util/Scanner; StackMapTable @ B 
SourceFile parImapar.java !               /     *� �    
                    	      �     ��
L=>� Y� � :6� -� � !+� 'O+.p� +.`=� �����6� D+.p� � � +Y-� /+.� 1� 5� !� � � +Y9� /+.� 1� 5� !����� � +Y;� /� 1� 5� !� � +Y=� /� 1� 5� !�    
   R       	 	  
   #  ,  5  <  ?  B 
 L  R  [  t  w  �  �  �  �     >    � ? @    � A B   � C D  	 � E D   � F D   � G H  I    �   J K   #$  L    M