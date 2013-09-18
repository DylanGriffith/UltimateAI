/**
 * Created with IntelliJ IDEA.
 * User: dgriffith
 * Date: 9/18/13
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class BoardState {
    public enum CellValue {
        Cross,
        Naught,
        Empty
    }

    public CellValue getCellValue(int row, int column) {
        return CellValue.Empty;
    }

    public void setCellValue(int row, int column, CellValue cellValue) {
    }
}