package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRelatesIterator theDocumentRelatesIterator = (DocumentRelatesIterator)findAncestorWithClass(this, DocumentRelatesIterator.class);
			pageContext.getOut().print(theDocumentRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for relates tag ");
		}
		return SKIP_BODY;
	}
}

