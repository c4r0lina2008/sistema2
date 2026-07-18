import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Produtos extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        // ==========================
        // MENU LATERAL
        // ==========================

        VBox menu = new VBox(20);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(220);

        menu.setStyle(
                "-fx-background-color: linear-gradient(to bottom,#5B2C83,#8E44AD);"
        );

        Label logo = new Label("📚 BookShelf");
        logo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
        logo.setTextFill(Color.WHITE);

        Separator separator = new Separator();

        Button inicio = new Button("🏠 Início");
        Button produtos = new Button("📖 Produtos");
        Button clientes = new Button("👤 Clientes");
        Button categorias = new Button("📂 Categorias");
        Button pedidos = new Button("📦 Pedidos");
        Button favoritos = new Button("❤ Favoritos");
        Button sair = new Button("🚪 Sair");

        Button[] botoes = {
                inicio,
                produtos,
                clientes,
                categorias,
                pedidos,
                favoritos,
                sair
        };

        for (Button b : botoes) {

            b.setPrefWidth(170);
            b.setPrefHeight(40);

            b.setStyle(
                    "-fx-background-color:transparent;" +
                    "-fx-text-fill:white;" +
                    "-fx-font-size:15;" +
                    "-fx-alignment:CENTER_LEFT;"
            );

            b.setOnMouseEntered(e -> {

                b.setStyle(
                        "-fx-background-color:#9B59B6;" +
                        "-fx-text-fill:white;" +
                        "-fx-font-size:15;" +
                        "-fx-background-radius:8;" +
                        "-fx-alignment:CENTER_LEFT;"
                );

            });

            b.setOnMouseExited(e -> {

                b.setStyle(
                        "-fx-background-color:transparent;" +
                        "-fx-text-fill:white;" +
                        "-fx-font-size:15;" +
                        "-fx-alignment:CENTER_LEFT;"
                );

            });

        }

        menu.getChildren().addAll(
                logo,
                separator,
                inicio,
                produtos,
                clientes,
                categorias,
                pedidos,
                favoritos,
                sair
        );

        root.setLeft(menu);

        // ==========================
        // ÁREA CENTRAL
        // ==========================

        VBox centro = new VBox(20);
        centro.setPadding(new Insets(25));

        centro.setStyle(
                "-fx-background-color:#F4F2FA;"
        );

        HBox topo = new HBox(20);
        topo.setAlignment(Pos.CENTER_LEFT);

        Label titulo = new Label("Catálogo de Livros");
        titulo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));

        Region espacador = new Region();
        HBox.setHgrow(espacador, Priority.ALWAYS);

        TextField pesquisa = new TextField();
        pesquisa.setPromptText("Pesquisar livros...");
        pesquisa.setPrefWidth(300);

        Button btnPesquisar = new Button("🔍");
        btnPesquisar.setPrefHeight(35);

        Button btnCarrinho = new Button("🛒");
        btnCarrinho.setPrefHeight(35);

        topo.getChildren().addAll(
                titulo,
                espacador,
                pesquisa,
                btnPesquisar,
                btnCarrinho
        );

        Label destaque = new Label("Produtos Disponíveis");
        destaque.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));

        GridPane gridLivros = new GridPane();
        gridLivros.setHgap(20);
        gridLivros.setVgap(20);

                // ==========================
        // LIVRO 1
        // ==========================

        VBox livro1 = new VBox(10);
        livro1.setAlignment(Pos.CENTER);
        livro1.setPadding(new Insets(15));
        livro1.setPrefWidth(220);

        livro1.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa1 = new ImageView(
                new Image("file:imagens/dom_casmurro.jpg")
        );

        capa1.setFitWidth(120);
        capa1.setFitHeight(170);

        Label nome1 = new Label("Dom Casmurro");
        nome1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label autor1 = new Label("Machado de Assis");
        Label preco1 = new Label("R$ 39,90");

        Button comprar1 = new Button("Adicionar ao Carrinho");
        comprar1.setPrefWidth(180);

        livro1.getChildren().addAll(
                capa1,
                nome1,
                autor1,
                preco1,
                comprar1
        );

        // ==========================
        // LIVRO 2
        // ==========================

        VBox livro2 = new VBox(10);
        livro2.setAlignment(Pos.CENTER);
        livro2.setPadding(new Insets(15));
        livro2.setPrefWidth(220);

        livro2.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa2 = new ImageView(
                new Image("file:imagens/o_alienista.jpg")
        );

        capa2.setFitWidth(120);
        capa2.setFitHeight(170);

        Label nome2 = new Label("O Alienista");
        nome2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label autor2 = new Label("Machado de Assis");
        Label preco2 = new Label("R$ 29,90");

        Button comprar2 = new Button("Adicionar ao Carrinho");
        comprar2.setPrefWidth(180);

        livro2.getChildren().addAll(
                capa2,
                nome2,
                autor2,
                preco2,
                comprar2
        );

        // ==========================
        // LIVRO 3
        // ==========================

        VBox livro3 = new VBox(10);
        livro3.setAlignment(Pos.CENTER);
        livro3.setPadding(new Insets(15));
        livro3.setPrefWidth(220);

        livro3.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa3 = new ImageView(
                new Image("file:imagens/vidas_secas.jpg")
        );

        capa3.setFitWidth(120);
        capa3.setFitHeight(170);

        Label nome3 = new Label("Vidas Secas");
        nome3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label autor3 = new Label("Graciliano Ramos");
        Label preco3 = new Label("R$ 35,90");

        Button comprar3 = new Button("Adicionar ao Carrinho");
        comprar3.setPrefWidth(180);

        livro3.getChildren().addAll(
                capa3,
                nome3,
                autor3,
                preco3,
                comprar3
        );

        // Primeira linha da grade

        gridLivros.add(livro1, 0, 0);
        gridLivros.add(livro2, 1, 0);
        gridLivros.add(livro3, 2, 0);

                // ==========================
        // LIVRO 4
        // ==========================

        VBox livro4 = new VBox(10);
        livro4.setAlignment(Pos.CENTER);
        livro4.setPadding(new Insets(15));
        livro4.setPrefWidth(220);

        livro4.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa4 = new ImageView(
                new Image("file:imagens/iracema.jpg")
        );

        capa4.setFitWidth(120);
        capa4.setFitHeight(170);

        Label nome4 = new Label("Iracema");
        nome4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label autor4 = new Label("José de Alencar");
        Label preco4 = new Label("R$ 27,90");

        Button comprar4 = new Button("Adicionar ao Carrinho");
        comprar4.setPrefWidth(180);

        livro4.getChildren().addAll(
                capa4,
                nome4,
                autor4,
                preco4,
                comprar4
        );

        // ==========================
        // LIVRO 5
        // ==========================

        VBox livro5 = new VBox(10);
        livro5.setAlignment(Pos.CENTER);
        livro5.setPadding(new Insets(15));
        livro5.setPrefWidth(220);

        livro5.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa5 = new ImageView(
                new Image("file:imagens/a_hora_da_estrela.jpg")
        );

        capa5.setFitWidth(120);
        capa5.setFitHeight(170);

        Label nome5 = new Label("A Hora da Estrela");
        nome5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label autor5 = new Label("Clarice Lispector");
        Label preco5 = new Label("R$ 31,90");

        Button comprar5 = new Button("Adicionar ao Carrinho");
        comprar5.setPrefWidth(180);

        livro5.getChildren().addAll(
                capa5,
                nome5,
                autor5,
                preco5,
                comprar5
        );

        // ==========================
        // LIVRO 6
        // ==========================

        VBox livro6 = new VBox(10);
        livro6.setAlignment(Pos.CENTER);
        livro6.setPadding(new Insets(15));
        livro6.setPrefWidth(220);

        livro6.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#D8D8D8;"
        );

        ImageView capa6 = new ImageView(
                new Image("file:imagens/grande_sertao.jpg")
        );

        capa6.setFitWidth(120);
        capa6.setFitHeight(170);

        Label nome6 = new Label("Grande Sertão: Veredas");
        nome6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));

        Label autor6 = new Label("João Guimarães Rosa");
        Label preco6 = new Label("R$ 59,90");

        Button comprar6 = new Button("Adicionar ao Carrinho");
        comprar6.setPrefWidth(180);

        livro6.getChildren().addAll(
                capa6,
                nome6,
                autor6,
                preco6,
                comprar6
        );

        // Segunda linha da grade

        gridLivros.add(livro4, 0, 1);
        gridLivros.add(livro5, 1, 1);
        gridLivros.add(livro6, 2, 1);

                // ==========================
        // PAINEL DO CARRINHO
        // ==========================

        VBox carrinho = new VBox(15);
        carrinho.setPadding(new Insets(20));
        carrinho.setPrefWidth(300);

        carrinho.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-color:#D8D8D8;" +
                "-fx-border-radius:15;"
        );

        Label tituloCarrinho = new Label("🛒 Carrinho");
        tituloCarrinho.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));

        Separator linha1 = new Separator();

        ListView<String> listaCarrinho = new ListView<>();
        listaCarrinho.setPrefHeight(220);

        listaCarrinho.getItems().addAll(
                "Seu carrinho está vazio."
        );

        Label lblQuantidade = new Label("Itens: 0");
        lblQuantidade.setFont(Font.font("Times New Roman", 16));

        Label lblSubtotal = new Label("Subtotal: R$ 0,00");
        lblSubtotal.setFont(Font.font("Times New Roman", 16));

        Label lblFrete = new Label("Frete: R$ 0,00");
        lblFrete.setFont(Font.font("Times New Roman", 16));

        Separator linha2 = new Separator();

                // ==========================
        // RESUMO DA COMPRA
        // ==========================

        Label tituloResumo = new Label("Resumo da Compra");
        tituloResumo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        GridPane resumo = new GridPane();
        resumo.setHgap(20);
        resumo.setVgap(10);

        Label txtSubtotal = new Label("Subtotal");
        txtSubtotal.setFont(Font.font("Times New Roman", 16));

        Label lblSubtotal = new Label("R$ 0,00");
        lblSubtotal.setFont(Font.font("Times New Roman", 16));

        Label txtFrete = new Label("Frete");
        txtFrete.setFont(Font.font("Times New Roman", 16));

        Label lblFrete = new Label("R$ 0,00");
        lblFrete.setFont(Font.font("Times New Roman", 16));

        Label txtDesconto = new Label("Desconto");
        txtDesconto.setFont(Font.font("Times New Roman", 16));

        Label lblDesconto = new Label("R$ 0,00");
        lblDesconto.setFont(Font.font("Times New Roman", 16));

        Separator linha2 = new Separator();

        Label txtTotal = new Label("TOTAL");
        txtTotal.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        Label lblTotal = new Label("R$ 0,00");
        lblTotal.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));

        resumo.add(txtSubtotal, 0, 0);
        resumo.add(lblSubtotal, 1, 0);

        resumo.add(txtFrete, 0, 1);
        resumo.add(lblFrete, 1, 1);

        resumo.add(txtDesconto, 0, 2);
        resumo.add(lblDesconto, 1, 2);

        resumo.add(txtTotal, 0, 3);
        resumo.add(lblTotal, 1, 3);
        );

        

