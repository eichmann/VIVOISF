package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListZHIterator theDocument = (DocumentNameListZHIterator)findAncestorWithClass(this, DocumentNameListZHIterator.class);
			pageContext.getOut().print(theDocument.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

