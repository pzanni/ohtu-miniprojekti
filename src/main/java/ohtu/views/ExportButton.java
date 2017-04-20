package ohtu.views;

import com.vaadin.server.FileDownloader;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.Button;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import ohtu.models.Reference;

public class ExportButton extends Button {

    private List<Reference> refs;

    public ExportButton() {
        super("Export Bibtex");
        new FileDownloader(createResource()).extend(this);
    }

    public void setReferences(List<Reference> refs) {
        this.refs = refs;
    }

    private StreamResource createResource() {
        return new StreamResource(new StreamResource.StreamSource() {
            @Override
            public InputStream getStream() {
                String bib = "";
                for (Reference r : refs) {
                    bib += r.toBibTex() + "\n";
                }
                return new ByteArrayInputStream(bib.getBytes());
            }
        }, "refs.bib");
    }
}
