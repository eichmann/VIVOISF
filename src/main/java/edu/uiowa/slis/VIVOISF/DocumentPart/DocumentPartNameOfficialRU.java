package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameOfficialRUIterator theDocumentPart = (DocumentPartNameOfficialRUIterator)findAncestorWithClass(this, DocumentPartNameOfficialRUIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

