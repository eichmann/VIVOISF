package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasNameIterator theDocumentHasNameIterator = (DocumentHasNameIterator)findAncestorWithClass(this, DocumentHasNameIterator.class);
			pageContext.getOut().print(theDocumentHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasName tag ");
		}
		return SKIP_BODY;
	}
}

