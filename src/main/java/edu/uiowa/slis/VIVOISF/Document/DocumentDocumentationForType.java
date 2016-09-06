package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentDocumentationForIterator theDocumentDocumentationForIterator = (DocumentDocumentationForIterator)findAncestorWithClass(this, DocumentDocumentationForIterator.class);
			pageContext.getOut().print(theDocumentDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

