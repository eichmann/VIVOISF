package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNumberIterator theDocument = (DocumentNumberIterator)findAncestorWithClass(this, DocumentNumberIterator.class);
			pageContext.getOut().print(theDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for number tag ");
		}
		return SKIP_BODY;
	}
}

