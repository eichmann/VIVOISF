package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPopulationNotesIterator theDocument = (DocumentPopulationNotesIterator)findAncestorWithClass(this, DocumentPopulationNotesIterator.class);
			pageContext.getOut().print(theDocument.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

