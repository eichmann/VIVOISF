package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRelatesIterator theDocumentRelatesIterator = (DocumentRelatesIterator)findAncestorWithClass(this, DocumentRelatesIterator.class);
			pageContext.getOut().print(theDocumentRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for relates tag ");
		}
		return SKIP_BODY;
	}
}

