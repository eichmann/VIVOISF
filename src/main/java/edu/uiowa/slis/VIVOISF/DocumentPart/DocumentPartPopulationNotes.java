package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPopulationNotesIterator theDocumentPart = (DocumentPartPopulationNotesIterator)findAncestorWithClass(this, DocumentPartPopulationNotesIterator.class);
			pageContext.getOut().print(theDocumentPart.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

