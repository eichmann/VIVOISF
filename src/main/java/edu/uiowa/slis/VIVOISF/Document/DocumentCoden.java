package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodenIterator theDocument = (DocumentCodenIterator)findAncestorWithClass(this, DocumentCodenIterator.class);
			pageContext.getOut().print(theDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for coden tag ");
		}
		return SKIP_BODY;
	}
}

