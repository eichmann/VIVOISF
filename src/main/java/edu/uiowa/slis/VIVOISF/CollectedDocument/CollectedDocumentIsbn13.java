package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentIsbn13Iterator theCollectedDocument = (CollectedDocumentIsbn13Iterator)findAncestorWithClass(this, CollectedDocumentIsbn13Iterator.class);
			pageContext.getOut().print(theCollectedDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

