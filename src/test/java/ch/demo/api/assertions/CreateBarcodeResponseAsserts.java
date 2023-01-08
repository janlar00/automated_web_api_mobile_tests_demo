package ch.demo.api.assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.AbstractAssert;

import ch.demo.api.models.barcode.CreateBarcodeResponse;

public class CreateBarcodeResponseAsserts extends AbstractAssert<CreateBarcodeResponseAsserts, CreateBarcodeResponse> {

    public CreateBarcodeResponseAsserts(final CreateBarcodeResponse createBarcodeResponse, final Class<?> selfType) {
        super(createBarcodeResponse, selfType);
    }

    public void isBarcodeReceivedAndOK() {

        boolean isBarcodeReceivedAndOK = false;
        boolean png = actual.getPng().equals("iVBORw0KGgoAAAANSUhEUgAAAZAAAAGQAQAAAACoxAthAAAF6klEQVR42u1cTa6jaAw0yoIlR"
                + "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");
        boolean raw = actual.getRaw().equals(
                "CqkBCM2VkOfLHBJyCiIIARIeWlZWIEVpbnplbGJpbGxldHQgLyBUYWdlc2thcnRlEgpaw7xyaWNoIEhCGgpXaW50ZXJ0aHVyIAEyBmRpcmVrdDgBQgcIsMDMqtgsSgcIwMDMqtgscAB6CygxLikoVikoSEEpgAEBmAECoAEAGhkaBkhpcnRlciIHQmFyYmFyYSoGCIDTqeBaIgAqCQoHCP/DzKrYLDIAOgBIABICCAEiDQoEMzM0MhIFVFQwMDEqLjAsAhQNfQ4kZYgJpRizSnQCCmGrER055wIUR3UB27hZ2pzt7Bq9bhDahClsjB4=");
        boolean barcodeId = actual.getBarcodeId().equals("600717423181");
        isBarcodeReceivedAndOK = png && raw && barcodeId;
        if (!png) System.out.println("\u001B[41m" + "Received png is not correct" + "\u001B[0m");
        if (!raw) System.out.println("\u001B[41m" + "Received raw is not correct" + "\u001B[0m");
        if (!barcodeId) System.out.println("\u001B[41m" + "Received barcodeId is not correct" + "\u001B[0m");
        if (isBarcodeReceivedAndOK) System.out.println("\u001B[102m" + "Received barcode is correct" + "\u001B[0m");
        assertTrue(isBarcodeReceivedAndOK);
    }
}