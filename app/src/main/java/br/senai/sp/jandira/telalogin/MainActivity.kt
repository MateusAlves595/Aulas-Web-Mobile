package br.senai.sp.jandira.telalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                LoginScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(
            horizontalArrangement = Arrangement.End
        ) {
            Surface(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(bottomStart = 16.dp),
                color = colorResource(id = R.color.rosa)
            ) {}
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(32.dp)
            ) {
                Text(
                    stringResource(id = R.string.login),
                    fontSize = 50.sp,
                    color = colorResource(id = R.color.rosa),
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    stringResource(id = R.string.subtitle),
                    fontSize = 15.sp,
                    color = Color.Gray,
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Light
                )
            }
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.email))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_email_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.password))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_lock_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )
            }
            Column (
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.rosa)),
                    modifier = Modifier
                        .width(134.dp)
                        .height(48.dp),
                    shape = RoundedCornerShape(15.dp),
                )
                {
                    Text(
                        stringResource(id = R.string.signIn).uppercase(),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Icon(painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                        contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color.White)
                }

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = stringResource(id = R.string.dontHave),
                        color = Color.Gray,
                        letterSpacing = 1.sp,
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = stringResource(id = R.string.signUp),
                        color = colorResource(id = R.color.rosa),
                        letterSpacing = 1.sp,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
            }
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            Surface(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(topEnd = 16.dp),
                color = colorResource(id = R.color.rosa)
            ) {}
        }
    }
}