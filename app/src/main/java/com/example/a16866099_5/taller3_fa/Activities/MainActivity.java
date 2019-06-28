package com.example.a16866099_5.taller3_fa.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a16866099_5.taller3_fa.Correo;
import com.example.a16866099_5.taller3_fa.Fragments.DataFragment;
import com.example.a16866099_5.taller3_fa.Fragments.DetailsFragment;
import com.example.a16866099_5.taller3_fa.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    private boolean isMultiPanel;
    private List<Correo> correos;
    Button btnPress1;
    Button btnPress2;
    Button btnPress3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       correos = new ArrayList<Correo>();
       correos.add(new Correo("-> Últimos días La Polar","fabroalv@gmail.com","laPolar@polar.com","No se pierda las últimas ofertas de La Polar!"));
       correos.add(new Correo("Bienvenido a Dicom","fabroalv@gmail.com","Dicom@dicom.com", "Estmaos muy felices de avisarle que se ha unido a nosotros!"));
        correos.add(new Correo("Usted es pobre","fabroalv@gmail.com","BancoMundialMundialoso@queseyo.com", "Debido a que pertenece a Dicom, usted es oficialmente pobre. De nada!"));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMultiPanel();
    }
    @Override
    public void sendData(String text)
    {

            if(isMultiPanel)
            {

                btnPress1 = (Button) findViewById(R.id.buttonSend);
                btnPress2 = (Button) findViewById(R.id.buttonSend2);
                btnPress3 = (Button) findViewById(R.id.buttonSend3);
                btnPress1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
                        detailsFragment.renderText("Asunto :" + correos.get(0).getSubject());
                        detailsFragment.renderTextTo("Para :" + correos.get(0).getTo());
                        detailsFragment.renderTextFrom("De :" + correos.get(0).getFrom());
                        detailsFragment.renderTextBody("  " + correos.get(0).getBody());
                    }
                });
                btnPress2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
                        detailsFragment.renderText("Asunto :" + correos.get(1).getSubject());
                        detailsFragment.renderTextTo("Para :" + correos.get(1).getTo());
                        detailsFragment.renderTextFrom("De :" + correos.get(1).getFrom());
                        detailsFragment.renderTextBody("  " + correos.get(1).getBody());
                    }
                });

                btnPress3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
                        detailsFragment.renderText("Asunto :" + correos.get(2).getSubject());
                        detailsFragment.renderTextTo("Para :" + correos.get(2).getTo());
                        detailsFragment.renderTextFrom("De :" + correos.get(2).getFrom());
                        detailsFragment.renderTextBody("  " + correos.get(2).getBody());
                    }
                });

            }else
            {
                Intent intent =  new Intent (this,DetailsActivity.class);
                intent.putExtra("text",text);
                startActivity(intent);
            }

    }
    private void setMultiPanel ()
    {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null );
    }

}