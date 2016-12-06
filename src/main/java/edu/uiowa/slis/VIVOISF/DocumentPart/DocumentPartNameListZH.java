package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListZHIterator theDocumentPart = (DocumentPartNameListZHIterator)findAncestorWithClass(this, DocumentPartNameListZHIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

