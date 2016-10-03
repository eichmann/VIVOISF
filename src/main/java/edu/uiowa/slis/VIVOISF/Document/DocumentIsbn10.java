package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentIsbn10Iterator theDocument = (DocumentIsbn10Iterator)findAncestorWithClass(this, DocumentIsbn10Iterator.class);
			pageContext.getOut().print(theDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

