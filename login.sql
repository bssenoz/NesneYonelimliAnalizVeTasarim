PGDMP     	                    z         	   iot-login    14.1    14.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    18399 	   iot-login    DATABASE     h   CREATE DATABASE "iot-login" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1252';
    DROP DATABASE "iot-login";
                postgres    false            ?            1259    18415    user    TABLE     c   CREATE TABLE public."user" (
    name character varying(40),
    password character varying(40)
);
    DROP TABLE public."user";
       public         heap    postgres    false            ?          0    18415    user 
   TABLE DATA           0   COPY public."user" (name, password) FROM stdin;
    public          postgres    false    209   ?       ?   $   x?K*-N?4426?**?M?,N䴴07?????? w?,     