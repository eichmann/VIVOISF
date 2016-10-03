package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPageStartIterator theDocument = (DocumentPageStartIterator)findAncestorWithClass(this, DocumentPageStartIterator.class);
			pageContext.getOut().print(theDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

