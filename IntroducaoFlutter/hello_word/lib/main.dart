import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';

void main() { // roda minha aplicação
  runApp(const MainApp());
}

class MainApp extends StatelessWidget { //janela de aplicação
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp( //base de construção ttff
      home: Scaffold( //modelo da página
        appBar: AppBar(title: Text("App Hello Word")), //AppBar
        body: Center(
          child: ElevatedButton(
            onPressed: () => Fluttertoast.showToast(
              msg: "Hello Word!!!",
              toastLength: Toast.LENGTH_SHORT,
              gravity: ToastGravity.CENTER
            ) ,
            child: Text("Ver Mensagem"),
          )
        ),
      ),
    );
  }
}
