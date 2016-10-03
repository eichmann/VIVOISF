package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentPageEndIterator theCollectedDocument = (CollectedDocumentPageEndIterator)findAncestorWithClass(this, CollectedDocumentPageEndIterator.class);
			pageContext.getOut().print(theCollectedDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

