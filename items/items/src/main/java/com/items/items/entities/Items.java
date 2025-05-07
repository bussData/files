@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idproducto;
    private Double cantidad;
    private Double price;
    private Long idOrden;
    
}