package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentIsbn13Iterator theDocument = (DocumentIsbn13Iterator)findAncestorWithClass(this, DocumentIsbn13Iterator.class);
			pageContext.getOut().print(theDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

