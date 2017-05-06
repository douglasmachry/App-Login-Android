package com.example.iossenac.applogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import com.example.iossenac.applogin.model.Usuario;

import java.util.List;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void verificaUser(View user){

            EditText editTextUsuario = (EditText)
                    findViewById(R.id.usuario);
            String usuario = editTextUsuario.getText().toString();
            EditText editTextSenha = (EditText)
                    findViewById(R.id.senha);
            String senha = editTextSenha.getText().toString();
            Usuario usuarioesenha = new Usuario(usuario,senha);

            if(this.getUsuariosInicial().contains(usuarioesenha)){
                Toast.makeText(this,"Login realizado com sucesso!", Toast.LENGTH_SHORT).show();
                Log.i("TagDouglas","Login realizado.");

            }else{
                //Caixa de texto que aparece na parte de baixo da tela
                Toast.makeText(this,"Usuario ou senha incorretos!", Toast.LENGTH_SHORT).show();
                //reguistrar em log
                Log.e("TagDouglas","Erro");
            };
        }

        private List<Usuario> getUsuariosInicial(){
            List<Usuario> listaUsuarios = new ArrayList<>();

            listaUsuarios.add(new Usuario("user1","123"));
            listaUsuarios.add(new Usuario("user2","123"));
            listaUsuarios.add(new Usuario("user3","123"));
            listaUsuarios.add(new Usuario("user4","123"));
            listaUsuarios.add(new Usuario("user5","123"));
            return listaUsuarios;

        }
    }

