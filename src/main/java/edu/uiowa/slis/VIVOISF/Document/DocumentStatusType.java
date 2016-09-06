package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentStatusIterator theDocumentStatusIterator = (DocumentStatusIterator)findAncestorWithClass(this, DocumentStatusIterator.class);
			pageContext.getOut().print(theDocumentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for status tag ");
		}
		return SKIP_BODY;
	}
}

