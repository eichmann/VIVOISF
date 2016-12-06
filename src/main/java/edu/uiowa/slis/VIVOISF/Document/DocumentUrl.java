package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentUrlIterator theDocument = (DocumentUrlIterator)findAncestorWithClass(this, DocumentUrlIterator.class);
			pageContext.getOut().print(theDocument.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for url tag ");
		}
		return SKIP_BODY;
	}
}

