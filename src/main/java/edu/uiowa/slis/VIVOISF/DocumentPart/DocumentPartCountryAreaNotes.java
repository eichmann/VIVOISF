package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCountryAreaNotesIterator theDocumentPart = (DocumentPartCountryAreaNotesIterator)findAncestorWithClass(this, DocumentPartCountryAreaNotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

