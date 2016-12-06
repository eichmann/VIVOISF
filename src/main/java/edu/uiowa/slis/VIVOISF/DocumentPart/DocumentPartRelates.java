package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRelatesIterator theDocumentPartRelatesIterator = (DocumentPartRelatesIterator)findAncestorWithClass(this, DocumentPartRelatesIterator.class);
			pageContext.getOut().print(theDocumentPartRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for relates tag ");
		}
		return SKIP_BODY;
	}
}

