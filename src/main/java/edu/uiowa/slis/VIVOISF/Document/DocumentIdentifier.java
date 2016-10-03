package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentIdentifierIterator theDocument = (DocumentIdentifierIterator)findAncestorWithClass(this, DocumentIdentifierIterator.class);
			pageContext.getOut().print(theDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for identifier tag ");
		}
		return SKIP_BODY;
	}
}

