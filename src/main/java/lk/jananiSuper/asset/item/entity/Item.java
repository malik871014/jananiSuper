package lk.jananiSuper.asset.item.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import lk.jananiSuper.asset.PurchaseOrder.entity.PurchaseOrderItem;
import lk.jananiSuper.asset.category.entity.Category;
import lk.jananiSuper.asset.item.entity.Enum.ItemStatus;
import lk.jananiSuper.asset.ledger.entity.Ledger;
import lk.jananiSuper.asset.supplierItem.entity.SupplierItem;
import lk.jananiSuper.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Item")
public class Item extends AuditEntity {

    @Size( min = 5, message = "Your name cannot be accepted" )
    private String name;

    @NotEmpty
    private String rop;

    @Column( unique = true )
    private String code;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @Enumerated( EnumType.STRING )
    private ItemStatus itemStatus;

    @ManyToOne
    private Category category;

    @OneToMany( mappedBy = "item" )
    private List<SupplierItem> supplierItem;

    @OneToMany( mappedBy = "item" )
    @JsonBackReference
    private List<Ledger> ledgers;

    @OneToMany( mappedBy = "item" )
    private List<PurchaseOrderItem> purchaseOrderItems;
}
