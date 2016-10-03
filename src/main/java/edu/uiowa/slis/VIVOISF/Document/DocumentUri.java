package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentUriIterator theDocument = (DocumentUriIterator)findAncestorWithClass(this, DocumentUriIterator.class);
			pageContext.getOut().print(theDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for uri tag ");
		}
		return SKIP_BODY;
	}
}

