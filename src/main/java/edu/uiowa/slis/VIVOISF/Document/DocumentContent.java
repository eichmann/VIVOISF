package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentContentIterator theDocument = (DocumentContentIterator)findAncestorWithClass(this, DocumentContentIterator.class);
			pageContext.getOut().print(theDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for content tag ");
		}
		return SKIP_BODY;
	}
}

