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

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        // ==========================
        // MENU LATERAL
        // ==========================

        VBox menu = new VBox(20);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(230);

        menu.setStyle(
                "-fx-background-color: linear-gradient(to bottom,#5B2C83,#8E44AD);" +
                "-fx-background-radius:0;"
        );

        Label logo = new Label("📚 BookShelf");
        logo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
        logo.setTextFill(Color.WHITE);

        Separator s1 = new Separator();

        Button inicio = new Button("🏠 Início");
        Button livros = new Button("📖 Livros");
        Button categorias = new Button("📂 Categorias");
        Button clientes = new Button("👤 Clientes");
        Button favoritos = new Button("❤ Favoritos");
        Button pedidos = new Button("📦 Meus Pedidos");
        Button sair = new Button("🚪 Sair");

        Button[] botoes = {
                inicio,
                livros,
                categorias,
                clientes,
                favoritos,
                pedidos,
                sair
        };

        for (Button b : botoes) {

            b.setPrefWidth(180);
            b.setPrefHeight(40);

            b.setStyle(
                    "-fx-background-color: transparent;" +
                    "-fx-text-fill:white;" +
                    "-fx-font-size:15;" +
                    "-fx-alignment:CENTER_LEFT;"
            );

            b.setOnMouseEntered(e ->
                    b.setStyle(
                            "-fx-background-color:#9B59B6;" +
                            "-fx-text-fill:white;" +
                            "-fx-font-size:15;" +
                            "-fx-background-radius:8;" +
                            "-fx-alignment:CENTER_LEFT;"
                    ));

            b.setOnMouseExited(e ->
                    b.setStyle(
                            "-fx-background-color: transparent;" +
                            "-fx-text-fill:white;" +
                            "-fx-font-size:15;" +
                            "-fx-alignment:CENTER_LEFT;"
                    ));
        }

        menu.getChildren().addAll(
                logo,
                s1,
                inicio,
                livros,
                categorias,
                clientes,
                favoritos,
                pedidos,
                sair
        );

        root.setLeft(menu);

        // ==========================
        // ÁREA PRINCIPAL
        // ==========================

        VBox centro = new VBox(20);
        centro.setPadding(new Insets(25));

        centro.setStyle(
                "-fx-background-color:#F4F2FA;"
        );

        HBox topo = new HBox(20);
        topo.setAlignment(Pos.CENTER_LEFT);

                // ==========================
        // TOPO DA APLICAÇÃO
        // ==========================

        Label boasVindas = new Label("Bem-vindo à BookShelf");
        boasVindas.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));

        Region espacador = new Region();
        HBox.setHgrow(espacador, Priority.ALWAYS);

        TextField pesquisa = new TextField();
        pesquisa.setPromptText("Pesquisar livros, autores ou categorias...");
        pesquisa.setPrefWidth(320);
        pesquisa.setPrefHeight(38);

        Button btnPesquisar = new Button("🔍");
        btnPesquisar.setPrefSize(40, 38);

        Button btnCarrinho = new Button("🛒");
        btnCarrinho.setPrefSize(45, 38);

        Button btnPerfil = new Button("👤 Carolina");
        btnPerfil.setPrefHeight(38);

        topo.getChildren().addAll(
                boasVindas,
                espacador,
                pesquisa,
                btnPesquisar,
                btnCarrinho,
                btnPerfil
        );

        // ==========================
        // TÍTULO
        // ==========================

        Label destaque = new Label("Livros em Destaque");
        destaque.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));

        // ==========================
        // GRID DE LIVROS
        // ==========================

        GridPane gridLivros = new GridPane();
        gridLivros.setHgap(20);
        gridLivros.setVgap(20);

        // ---------- LIVRO 1 ----------

        VBox livro1 = new VBox(10);
        livro1.setAlignment(Pos.CENTER);
        livro1.setPadding(new Insets(15));

        livro1.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar1.setPrefWidth(170);

        livro1.getChildren().addAll(
                capa1,
                nome1,
                autor1,
                preco1,
                comprar1
        );

        // ---------- LIVRO 2 ----------

        VBox livro2 = new VBox(10);
        livro2.setAlignment(Pos.CENTER);
        livro2.setPadding(new Insets(15));

        livro2.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar2.setPrefWidth(170);

        livro2.getChildren().addAll(
                capa2,
                nome2,
                autor2,
                preco2,
                comprar2
        );

        // ---------- LIVRO 3 ----------

        VBox livro3 = new VBox(10);
        livro3.setAlignment(Pos.CENTER);
        livro3.setPadding(new Insets(15));

        livro3.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar3.setPrefWidth(170);

        livro3.getChildren().addAll(
                capa3,
                nome3,
                autor3,
                preco3,
                comprar3
        );

        // Primeira linha do catálogo
        gridLivros.add(livro1, 0, 0);
        gridLivros.add(livro2, 1, 0);
        gridLivros.add(livro3, 2, 0);

                // ==========================
        // TOPO DA APLICAÇÃO
        // ==========================

        Label boasVindas = new Label("Bem-vindo à BookShelf");
        boasVindas.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));

        Region espacador = new Region();
        HBox.setHgrow(espacador, Priority.ALWAYS);

        TextField pesquisa = new TextField();
        pesquisa.setPromptText("Pesquisar livros, autores ou categorias...");
        pesquisa.setPrefWidth(320);
        pesquisa.setPrefHeight(38);

        Button btnPesquisar = new Button("🔍");
        btnPesquisar.setPrefSize(40, 38);

        Button btnCarrinho = new Button("🛒");
        btnCarrinho.setPrefSize(45, 38);

        Button btnPerfil = new Button("👤 Carolina");
        btnPerfil.setPrefHeight(38);

        topo.getChildren().addAll(
                boasVindas,
                espacador,
                pesquisa,
                btnPesquisar,
                btnCarrinho,
                btnPerfil
        );

        // ==========================
        // TÍTULO
        // ==========================

        Label destaque = new Label("Livros em Destaque");
        destaque.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));

        // ==========================
        // GRID DE LIVROS
        // ==========================

        GridPane gridLivros = new GridPane();
        gridLivros.setHgap(20);
        gridLivros.setVgap(20);

        // ---------- LIVRO 1 ----------

        VBox livro1 = new VBox(10);
        livro1.setAlignment(Pos.CENTER);
        livro1.setPadding(new Insets(15));

        livro1.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar1.setPrefWidth(170);

        livro1.getChildren().addAll(
                capa1,
                nome1,
                autor1,
                preco1,
                comprar1
        );

        // ---------- LIVRO 2 ----------

        VBox livro2 = new VBox(10);
        livro2.setAlignment(Pos.CENTER);
        livro2.setPadding(new Insets(15));

        livro2.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar2.setPrefWidth(170);

        livro2.getChildren().addAll(
                capa2,
                nome2,
                autor2,
                preco2,
                comprar2
        );

        // ---------- LIVRO 3 ----------

        VBox livro3 = new VBox(10);
        livro3.setAlignment(Pos.CENTER);
        livro3.setPadding(new Insets(15));

        livro3.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-radius:15;" +
                "-fx-border-color:#DDDDDD;"
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
        comprar3.setPrefWidth(170);

        livro3.getChildren().addAll(
                capa3,
                nome3,
                autor3,
                preco3,
                comprar3
        );

        // Primeira linha do catálogo
        gridLivros.add(livro1, 0, 0);
        gridLivros.add(livro2, 1, 0);
        gridLivros.add(livro3, 2, 0);

                // ==========================
        // RESUMO DA COMPRA
        // ==========================

        VBox resumoCompra = new VBox(15);
        resumoCompra.setPadding(new Insets(20));
        resumoCompra.setPrefWidth(280);

        resumoCompra.setStyle(
                "-fx-background-color:white;" +
                "-fx-background-radius:15;" +
                "-fx-border-color:#D8D8D8;" +
                "-fx-border-radius:15;"
        );

        Label tituloResumo = new Label("🛒 Resumo da Compra");
        tituloResumo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));

        Separator separador = new Separator();

        Label lblItens = new Label("Itens: 0");
        lblItens.setFont(Font.font("Times New Roman", 16));

        Label lblSubtotal = new Label("Subtotal: R$ 0,00");
        lblSubtotal.setFont(Font.font("Times New Roman", 16));

        Label lblFrete = new Label("Frete: R$ 0,00");
        lblFrete.setFont(Font.font("Times New Roman", 16));

        Separator separador2 = new Separator();

        Label lblTotal = new Label("Total: R$ 0,00");
        lblTotal.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

                // ==========================
        // MÉTODO DE PAGAMENTO
        // ==========================

        Separator separador4 = new Separator();

        Label lblPagamento = new Label("Forma de Pagamento");
        lblPagamento.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));

        ComboBox<String> pagamento = new ComboBox<>();
        pagamento.getItems().addAll(
                "💳 Cartão de Crédito",
                "⚡ PIX",
                "📄 Boleto Bancário"
        );

        pagamento.setPromptText("Selecione uma opção");
        pagamento.setPrefWidth(220);

        // ==========================
        // FINALIZAR COMPRA
        // ==========================

        Button btnFinalizar = new Button("🛒 Finalizar Compra");

        btnFinalizar.setPrefWidth(220);
        btnFinalizar.setPrefHeight(45);

        btnFinalizar.setStyle(
                "-fx-background-color:#6A1B9A;" +
                "-fx-text-fill:white;" +
                "-fx-font-size:16;" +
                "-fx-font-weight:bold;" +
                "-fx-background-radius:10;"
        );

        Label mensagemCompra = new Label();
        mensagemCompra.setWrapText(true);

        btnFinalizar.setOnAction(e -> {

            if (pagamento.getValue() == null) {

                mensagemCompra.setTextFill(Color.RED);
                mensagemCompra.setText("Selecione uma forma de pagamento.");
                return;
            }

            mensagemCompra.setTextFill(Color.GREEN);

            mensagemCompra.setText(
                    "✅ Compra realizada com sucesso!\n\n" +
                    "Forma de pagamento:\n" +
                    pagamento.getValue() +
                    "\n\nObrigado por comprar na BookShelf!"
            );

        });
        
        resumoCompra.getChildren().addAll(
        resumoCompra.getChildren().addAll(
            tituloResumo,
            separador,
            lblItens,
            lblSubtotal,
            lblFrete,
            separador2,
            lblTotal,
            separador3,
            lblCupom,
            txtCupom,
            btnAplicarCupom,
            lblDesconto,
            mensagemCupom
);
        );

                HBox conteudo = new HBox(25);

        conteudo.getChildren().addAll(
                gridLivros,
                resumoCompra
        );

        centro.getChildren().addAll(
                topo,
                destaque,
                conteudo
        );

        root.setCenter(centro);

                HBox conteudo = new HBox(25);

        conteudo.getChildren().addAll(
                gridLivros,
                resumoCompra
        );

        centro.getChildren().addAll(
                topo,
                destaque,
                conteudo
        );

        root.setCenter(centro);

        

