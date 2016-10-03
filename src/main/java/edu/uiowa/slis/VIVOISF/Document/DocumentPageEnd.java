package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPageEndIterator theDocument = (DocumentPageEndIterator)findAncestorWithClass(this, DocumentPageEndIterator.class);
			pageContext.getOut().print(theDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

