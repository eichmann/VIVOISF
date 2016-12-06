package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasEmailIterator theDocumentHasEmailIterator = (DocumentHasEmailIterator)findAncestorWithClass(this, DocumentHasEmailIterator.class);
			pageContext.getOut().print(theDocumentHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

