package session11.practice.datatransferinformationsystem;

import java.util.List;

public abstract class Report {

    protected String title;
    protected List<String> data;

    Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}

interface PDFExport {

    void exportPdf();
}

interface CSVExport {

    void exportCsv();
}

class PDFReport extends Report implements PDFExport {

    PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
        // Implementation for PDF preview
    }

    @Override
    public void exportPdf() {
        // Implementation for PDF export
    }
}

class CSVReport extends Report implements CSVExport {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
        // Implementation for CSV preview
    }

    @Override
    public void exportCsv() {
        // Implementation for CSV export
    }
}