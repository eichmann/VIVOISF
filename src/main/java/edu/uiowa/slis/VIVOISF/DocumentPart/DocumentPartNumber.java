package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNumberIterator theDocumentPart = (DocumentPartNumberIterator)findAncestorWithClass(this, DocumentPartNumberIterator.class);
			pageContext.getOut().print(theDocumentPart.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for number tag ");
		}
		return SKIP_BODY;
	}
}

