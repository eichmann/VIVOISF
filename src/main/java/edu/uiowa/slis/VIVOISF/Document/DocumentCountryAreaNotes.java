package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCountryAreaNotesIterator theDocument = (DocumentCountryAreaNotesIterator)findAncestorWithClass(this, DocumentCountryAreaNotesIterator.class);
			pageContext.getOut().print(theDocument.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

