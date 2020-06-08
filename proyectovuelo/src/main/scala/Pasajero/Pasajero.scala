package Pasajero
import Pasaje

class Pasajero{
    
    //Atributos
    var _id : String = _
    var _nombre : String = _
    var _correo : String = _
    var _pasajes : List[Pasaje] = List()

    def this(id:String,nomb:String,corr:String,psj:List[Pasaje]) ={
        this();
        _id = id;
        _nombre = nomb;
        _correo = corr;
        _pasajes = psj;
    }

    //setters
    def id_(id:String) ={
        _id = id
    } 
    def nombre_(nomb:String) ={
        _nombre = nomb
    }
    def correo_(corr:String) ={
        _correo = corr
    }
    def pasajes_(psj:List[Pasaje]) ={
        _pasajes = psj
    }
}