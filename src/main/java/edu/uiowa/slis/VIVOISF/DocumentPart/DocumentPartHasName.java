package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasNameIterator theDocumentPartHasNameIterator = (DocumentPartHasNameIterator)findAncestorWithClass(this, DocumentPartHasNameIterator.class);
			pageContext.getOut().print(theDocumentPartHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasName tag ");
		}
		return SKIP_BODY;
	}
}
