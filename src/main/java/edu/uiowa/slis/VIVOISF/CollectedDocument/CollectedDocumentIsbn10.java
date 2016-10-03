package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentIsbn10Iterator theCollectedDocument = (CollectedDocumentIsbn10Iterator)findAncestorWithClass(this, CollectedDocumentIsbn10Iterator.class);
			pageContext.getOut().print(theCollectedDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

