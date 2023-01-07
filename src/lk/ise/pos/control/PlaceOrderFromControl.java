package lk.ise.pos.control;

import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import lk.ise.pos.db.Database;
import lk.ise.pos.entity.Customers;
import lk.ise.pos.entity.Item;

import javax.xml.crypto.Data;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 1/7/2023
 **/
public class PlaceOrderFromControl {


    public TextField txtName;
    public ComboBox<String> cmbCustomerId;
    public TextField txtAddress;
    public TextField txtSalary;
    public ComboBox<String> cmbItemCode;
    public TextField txtDes;
    public TextField txtUnitPrice;
    public TextField txtQty;

    public void initialize(){
        loadCustomerIds();
        loadItemCode();

        cmbCustomerId.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null){
                setCustomerData(newValue);
            }
        });

        cmbItemCode.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null){
//                set(newValue);
            }
        });
    }

    private void loadItemCode() {
        for (Item data : Database.items)cmbItemCode.getItems().add(data.getCode());
    }

    private void setCustomerData(String id){
        Customers customers = Database.customers.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);

        if (customers != null){
            //Set
            txtName.setText(customers.getName());
            txtAddress.setText(customers.getAddress());
            //String,StringBuilder,StringBuffer
            txtSalary.setText(String.valueOf(customers.getSalary()));
        }else {
            new Alert(Alert.AlertType.WARNING,"Not Found").show();
        }
    }

    private void loadCustomerIds() {

        for (Customers data : Database.customers){
            cmbCustomerId.getItems().add(data.getId());
        }

    }
}
