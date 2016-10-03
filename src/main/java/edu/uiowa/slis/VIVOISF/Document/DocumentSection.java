package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentSectionIterator theDocument = (DocumentSectionIterator)findAncestorWithClass(this, DocumentSectionIterator.class);
			pageContext.getOut().print(theDocument.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for section tag ");
		}
		return SKIP_BODY;
	}
}

