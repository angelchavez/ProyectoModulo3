package com.juice.factory;
import com.juice.utils.Variables;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;


public class CheckoutPage extends Variables {

    protected JavascriptExecutor javascriptExecutor;
    WebDriverWait wait;
    By anunciodissmiss = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
    By inptEmail = By.id("email");
    By inpPassword = By.id("password");
    By innAccount = By.id("navbarAccount");
    By itemOrder = By.xpath("//*[@id='mat-menu-panel-0']/div/button[2]");
    By itemAddress = By.xpath("//button[contains(@routerlink,'/address/saved')]");
    By btnAddNewAddress = By.xpath("//button[@aria-label='Add a new address']");
    By inputPais = By.xpath("//input[contains(@data-placeholder,'Please provide a country.')]");
    By inputName = By.xpath("//input[contains(@placeholder,'Please provide a name.')]");
    By inputPhone = By.xpath("//input[contains(@data-placeholder,'Please provide a mobile number.')]");
    By inputCodigoPost = By.xpath("//input[@placeholder='Please provide a ZIP code.']");
    By inputDireccion = By.xpath("//textarea[contains(@placeholder,'Please provide an address.')]");
    By inputCity = By.xpath("//input[contains(@data-placeholder,'Please provide a city.')]");
    By inputState = By.xpath("//input[contains(@data-placeholder,'Please provide a state.')]");
    By anuncioMeWant = By.xpath("/html/body/div[1]/div/a");
    By inputSubmit = By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By publicidad = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
    By inputacount = By.xpath("(//span[normalize-space()='Account'])[1]");
    By inputLogin = By.xpath("//*[@id='navbarLoginButton']/span");
    By inputEmail = By.xpath("(//input[@id='email'])[1]");
    By inputpass = By.xpath("(//input[@id='password'])[1]");
    By inputOption = By.cssSelector("button[aria-label='Go to saved payment methods page']");
    By inputAddNewcard = By.xpath("//mat-panel-title[contains(.,'Add new card')]");
    By inputName1 = By.xpath("//*[@id='mat-input-7']");
    By inputCardNumber = By.xpath("//*[@id='mat-input-8']");
    By inputExpiryMonth = By.xpath("//*[@id='mat-input-9']");
    By inputExpirYear = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select");
    By anuncio = By.xpath("/html/body/div[1]/div/a");
    By buscador = By.xpath("//mat-icon[contains(.,'search')]");
    By escribirbuscador = By.xpath("//input[contains(@type,'text')]");
    By selecProducto = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[1]/div[1]/img");
    By cerrarProducto = By.xpath("//i[@class='material-icons'][contains(.,'close')]");
    By addProduct = By.xpath("(//span[contains(text(),'Add to Basket')])[1]");
    By addProduct2 = By.xpath("(//button[@aria-label='Add to Basket'])[3]");
    By TableProducto = By.xpath("//mat-table[contains(@class,'mat-table cdk-table')]"); //clase padre
    By YourBasket = By.xpath("//button[contains(@class,'mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted')]");
    By addCheckout = By.id("checkoutButton");
    By addCheckout1 = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/button");
    By addContinue = By.xpath("//button[@color='primary'][contains(.,'navigate_next Continue')]");

    public CheckoutPage(WebDriver driver) {
        Variables.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void LoginForm(String username, String password) {
        driver.findElement(anunciodissmiss).click();
        //loginPage.LoginFormulario(username,password);
        driver.findElement(inptEmail).sendKeys(username);
        driver.findElement(inpPassword).sendKeys(password);
    }
    public void Account() {
        driver.findElement(innAccount).click();
        driver.findElement(itemOrder).click();
        driver.findElement(itemAddress).click();
    }
    public void BotonAddNewAddress() {
        driver.findElement(btnAddNewAddress).click();
    }
    public void AddNewAddress(String Country, String Name, String Phone, String CodigoPostal, String Direccion, String City, String State) throws Exception {
        driver.findElement(inputPais).sendKeys(Country);
        driver.findElement(inputName).sendKeys(Name);
        driver.findElement(inputPhone).sendKeys(Phone);
        driver.findElement(inputCodigoPost).sendKeys(CodigoPostal);
        driver.findElement(inputDireccion).sendKeys(Direccion);
        driver.findElement(inputCity).sendKeys(City);
        driver.findElement(inputState).sendKeys(State);
        Thread.sleep(1000);
        driver.findElement(anuncioMeWant).click();
    }
    public void ButtonSubmit() throws Exception {
        Thread.sleep(1000);
        driver.findElement(inputSubmit).click();

    }
    public void AddNewCARD() throws InterruptedException {
        String name = "juanperez@gmail.com";
        String password = "eljugador90";
        driver.findElement(publicidad).click();
        driver.findElement(inputacount).click();
        driver.findElement(inputLogin).click();
        driver.findElement(inputEmail).sendKeys(name);
        driver.findElement(inputpass).sendKeys(password);
        homePage.gotoLogin();
        driver.findElement(inputacount).click();
        Thread.sleep(1000);
        driver.findElement(itemOrder).click();
        driver.findElement(inputOption).click();
        driver.findElement(inputAddNewcard).click();
    }
    public void FormAddNewCard(String name, String CardNumber, String ExpiryMonth, String ExpiryYear) throws InterruptedException {
        driver.findElement(inputName1).sendKeys(name);
        driver.findElement(inputCardNumber).sendKeys(CardNumber);
        Thread.sleep(1000);
        driver.findElement(inputExpiryMonth).sendKeys(ExpiryMonth);
        driver.findElement(anuncio).click();
        driver.findElement(inputExpirYear).sendKeys(ExpiryYear);
    }
    public void UsuarioIniciaSesion(String username, String password) {
        //ojitoo
        username = "juanperez@gmail.com";
        password = "eljugador90";
        driver.get("http://localhost:3000/#/login");
        //driver.get("https://juice-shop.herokuapp.com/#/login");
        driver.findElement(anunciodissmiss).click(); // SE ESTA AGREGANDO 9:21 PM LUEGO SE QUITA
        //driver.findElement(anuncioMeWant).click();
        WebElement inputUsuario = wait.until(ExpectedConditions.elementToBeClickable(inptEmail));
        WebElement inputContrasena = driver.findElement(inpPassword);
        WebElement loginButton = driver.findElement(homePage.loginLink);
        inputUsuario.sendKeys(username);
        inputContrasena.sendKeys(password);
        loginButton.click();

    }
    public void UsuarioIniciaSesion1(String username, String password) {
        //ojitoo
        username = "juanperez@gmail.com";
        password = "eljugador90";
        driver.get("http://localhost:3000/#/login");
        //driver.get("https://juice-shop.herokuapp.com/#/login");
        try {
            // Buscar el elemento y verificar si está visible
            WebElement anuncio = driver.findElement(anunciodissmiss);
            if (anuncio.isDisplayed()) {
                // Si está visible, hacer clic para cerrarlo
                anuncio.click();
                System.out.println("Anuncio cerrado.");
            } else {
                // Si no está visible, desactivar lógica adicional
                System.out.println("El anuncio no está visible.");
            }
        } catch (Exception e) {
            // Si el elemento no se encuentra
            System.out.println("El anuncio no está presente: " + e.getMessage());
        }
         driver.findElement(anuncioMeWant).click();

        WebElement inputUsuario = wait.until(ExpectedConditions.elementToBeClickable(inptEmail));
        WebElement inputContrasena = driver.findElement(inpPassword);
        WebElement loginButton = driver.findElement(homePage.loginLink);
        inputUsuario.sendKeys(username);
        inputContrasena.sendKeys(password);
        loginButton.click();

    }
    public void usuarioEnPaginaPrincipal() {

        wait.until(ExpectedConditions.urlToBe("http://localhost:3000/#/search"));
        //wait.until(ExpectedConditions.urlToBe("https://juice-shop.herokuapp.com/#/search"));
    }
    public void usuarioBuscaProducto(String producto) {

        driver.findElement(buscador).click();
        WebElement buscador = driver.findElement(escribirbuscador);
        buscador.sendKeys(producto, Keys.ENTER);

    }
    public void seleccionaProducto(String Producto) {

        WebElement productoSeleccionado = driver.findElement(selecProducto);
        productoSeleccionado.click();
        driver.findElement(cerrarProducto).click();
    }
    public void agregaProductoCesta() {

        driver.findElement(addProduct).click();
    }
    public void verificarProductoEnCesta(String producto) {
        driver.findElement(YourBasket).click();
        WebElement s = driver.findElement(TableProducto);
        waitElementVisible(s, 10);
        List<WebElement> listProduct = s.findElements(By.xpath("//mat-header-row[contains(@role,'row')]"));
        System.out.printf("lista producto 01:" + listProduct.get(0).getText() + "\n");
    }

    public void seleccionPedidoChec() {
        driver.findElement(addCheckout).click();
    }
    public void addSegundaDireccion() throws InterruptedException {

        List<WebElement> rows = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows.size() >= 2) {
            WebElement secondAddressRadioButton = rows.get(1).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
        driver.findElement(anuncioMeWant).click();
        driver.findElement(addContinue).click();
        List<WebElement> rows1 = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows1.size() >= 2) {
            WebElement secondAddressRadioButton = rows1.get(0).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
        Thread.sleep(10000);
        driver.findElement(addContinue).click();
    }
    public void addprimerMetodopago() {
        List<WebElement> rows2 = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows2.size() >= 2) {
            WebElement secondAddressRadioButton = rows2.get(0).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
    }
    public void addCreditCard() {
        driver.findElement(addContinue).click();
    }
    public void titleOrdenPago() {
        WebElement orderSummaryElement = driver.findElement(By.xpath("//div[@class='order-summary'][contains(.,'Order Summary')]"));

        // Variable que contiene el texto esperado
        String expectedTitle = "Order Summary";

        // Validar que el texto del elemento contiene "Order Summary"
        boolean isOrderSummaryCorrect = orderSummaryElement.getText().contains(expectedTitle);
        Assert.assertTrue(isOrderSummaryCorrect, "El título no coincide con 'Order Summary'");

        // Mensaje en consola según el resultado
        if (isOrderSummaryCorrect) {
            System.out.println("Su orden se registró exitosamente.");
        } else {
            System.out.println("No se registró el orden de pago.");
        }
    }
    //PEDIDO 02
    public void seleccionaAleatorioProductos() throws InterruptedException {
        driver.findElement(addProduct).click();
        driver.findElement(addProduct2).click();
        driver.findElement(YourBasket).click();
        Thread.sleep(10000);
        try {
            // Buscar el elemento y verificar si está visible
            WebElement anuncio = driver.findElement(anunciodissmiss);
            if (anuncio.isDisplayed()) {
                // Si está visible, hacer clic para cerrarlo
                anuncio.click();
                System.out.println("Anuncio cerrado.");
            } else {
                // Si no está visible, desactivar lógica adicional
                System.out.println("El anuncio no está visible.");
            }
        } catch (Exception e) {
            // Si el elemento no se encuentra
            System.out.println("El anuncio no está presente: " + e.getMessage());
        }
       // driver.findElement(anunciodissmiss).click();
        driver.findElement(addCheckout1).click();
    }
    public void DireccionAgregado() throws InterruptedException {
        List<WebElement> rows = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows.size() >= 2) {
            WebElement secondAddressRadioButton = rows.get(1).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
        //Thread.sleep(15000);
        driver.findElement(addContinue).click();
        List<WebElement> rows1 = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows1.size() >= 2) {
            WebElement secondAddressRadioButton = rows1.get(0).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
    }
    public void seleccionarContinue(){
        driver.navigate().refresh();
        //driver.findElement(anunciodissmiss).click();
        try {
            // Buscar el elemento y verificar si está visible
            WebElement anuncio = driver.findElement(anunciodissmiss);
            if (anuncio.isDisplayed()) {
                // Si está visible, hacer clic para cerrarlo
                anuncio.click();
                System.out.println("Anuncio cerrado.");
            } else {
                // Si no está visible, desactivar lógica adicional
                System.out.println("El anuncio no está visible.");
            }
        } catch (Exception e) {
            // Si el elemento no se encuentra
            System.out.println("El anuncio no está presente: " + e.getMessage());
        }

        driver.findElement(addContinue).click();
    }

    public void OptionDelivery() throws InterruptedException {
        //Thread.sleep(5000);
        List<WebElement> rows2 = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows2.size() >= 2) {
            WebElement secondAddressRadioButton = rows2.get(0).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }

        driver.findElement(addContinue).click();

    }
    public void  MyPayment() throws InterruptedException {
        //Thread.sleep(5000);
        List<WebElement> rows2 = driver.findElements(By.cssSelector(".mat-row.cdk-row.ng-star-inserted"));
        if (rows2.size() >= 2) {
            WebElement secondAddressRadioButton = rows2.get(0).findElement(By.cssSelector("mat-radio-button"));
            secondAddressRadioButton.click();
        } else {
            throw new IllegalStateException("No hay suficientes direcciones en la tabla.");
        }
        driver.findElement(addContinue).click();

    }
}








