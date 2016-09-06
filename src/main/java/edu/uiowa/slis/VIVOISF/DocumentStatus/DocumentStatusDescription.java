package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentStatusDescriptionIterator theDocumentStatus = (DocumentStatusDescriptionIterator)findAncestorWithClass(this, DocumentStatusDescriptionIterator.class);
			pageContext.getOut().print(theDocumentStatus.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for description tag ");
		}
		return SKIP_BODY;
	}
}

