package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRelatesIterator theDocumentPartRelatesIterator = (DocumentPartRelatesIterator)findAncestorWithClass(this, DocumentPartRelatesIterator.class);
			pageContext.getOut().print(theDocumentPartRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for relates tag ");
		}
		return SKIP_BODY;
	}
}

