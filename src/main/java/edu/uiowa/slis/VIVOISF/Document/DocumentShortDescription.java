package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentShortDescriptionIterator theDocument = (DocumentShortDescriptionIterator)findAncestorWithClass(this, DocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

