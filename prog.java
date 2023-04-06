
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class prog{
    public static void main(String[] args) {
        String csvFile = "products.csv";
        String csvSplitBy = ",";
        String[] products = {
                "HON 38000 Series L-Shaped Office Desk,$2,092.99,2445368, HON38LR7284NS,Computer,(Mahogany/Charcoal High-Pressure Laminate (HPL),Best-in-class steel construction withstands heavy activity and frequent relocation, Drawers open fully to give easy access to all contents,) ",
                "Bush Business Furniture Studio A 83 Large Corner Gaming Desk with Chair and Drawers,$1,999.99,24509993,STA011WHSU|,computer,(Corner gaming desk and chair set takes your gaming setup to the next level,Made of engineered wood in a white finish)",
                "HON 38000 Series 2 Pc. Left L-Workstation,$1,887.00,SKU003, 24298311,computer,Upgrade your office setup with this HON 38000 Series left L-station, which comes in a warm, welcoming charcoal and mahogany color scheme. ",
                "Bush Business Furniture Studio C 72W x 36D U Shaped Desk with Hutch and Mobile File Cabinet,$1,828.99,24274625,STC003WHSU,computer,Give your office the workspace you need and the style you deserve with this Bush Business Furniture Studio C U Shaped Desk with Hutch and Mobile File Cabinet. ",
                "Bush Business Furniture Westfield 72W x 36D Bow Front U Shaped Desk w/ Mobile File Cabinets,$1,673.99,88263, SRC043MRSU,computer,Sophisticated and spacious, this Bush Business Furniture Westfield U Shaped Desk brings commercial-quality features and durability to the workplace.",
                "Bush Business Furniture Westfield 72W L Shaped Desk with Hutch and Mobile File Cabinet,5$1,568.99,88091,SRC0018NCSU,	Computer,The Bush Business Furniture Westfield L Shaped Desk with Hutch and Mobile File Cabinet has expansive work surfaces, convenient storage features and a sturdy design for years of everyday use. ",
                "Bush Business Furniture Westfield 72W L Shaped Desk with Hutch and Mobile File Cabinet,$1,568.99,S88091,SRC0018NCSU,CComputer,A durable office set with a classic design, the Bush Business Furniture Westfield L Shaped Desk with Hutch and storage completes any professional workspace.",
                "Bush Furniture Mayfield 60 L-Shaped Computer Desk with Desktop Organizer and 6-Cube Bookcase,$1,517.99,24424706,MAY013GW2,Computer,The Bush Furniture Mayfield 60W L-shaped computer desk with desktop organizer and six-cube bookcase gives your home office a touch of modern farmhouse style.",
                "Bush Furniture Fairview 60W L-Shaped Desk with Lateral File Cabinet and 5-Shelf Bookcase,$1,441.99,24528860,FV008AB,Computer,The Bush Furniture Fairview 60W L-shaped desk with lateral file cabinet and five-shelf bookcase offers a practical home office solution that invokes the cozy",
                "Bush Furniture Saratoga 66 L-Shaped Computer Desk with Drawers,$1,434.99,24470104,EX45770-03K,Computer,The Bush Furniture Saratoga L-shaped computer desk with drawers presents a practical, durable workspace that reflects the refined elegance of timeless traditional styling. "
        };
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String product : products) {
                bw.write(product);
                bw.newLine();
            }
            System.out.println("Product details saved to CSV file successfully.");
            System.out.println(bw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
