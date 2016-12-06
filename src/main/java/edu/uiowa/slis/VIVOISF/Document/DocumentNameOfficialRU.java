package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameOfficialRUIterator theDocument = (DocumentNameOfficialRUIterator)findAncestorWithClass(this, DocumentNameOfficialRUIterator.class);
			pageContext.getOut().print(theDocument.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

