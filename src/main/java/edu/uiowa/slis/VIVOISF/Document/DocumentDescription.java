package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentDescriptionIterator theDocument = (DocumentDescriptionIterator)findAncestorWithClass(this, DocumentDescriptionIterator.class);
			pageContext.getOut().print(theDocument.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for description tag ");
		}
		return SKIP_BODY;
	}
}

