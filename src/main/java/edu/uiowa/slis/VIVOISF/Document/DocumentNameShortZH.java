package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortZHIterator theDocument = (DocumentNameShortZHIterator)findAncestorWithClass(this, DocumentNameShortZHIterator.class);
			pageContext.getOut().print(theDocument.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

