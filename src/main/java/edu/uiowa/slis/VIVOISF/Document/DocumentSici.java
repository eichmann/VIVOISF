package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentSiciIterator theDocument = (DocumentSiciIterator)findAncestorWithClass(this, DocumentSiciIterator.class);
			pageContext.getOut().print(theDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for sici tag ");
		}
		return SKIP_BODY;
	}
}

