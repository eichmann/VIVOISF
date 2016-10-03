package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentPageStartIterator theCollectedDocument = (CollectedDocumentPageStartIterator)findAncestorWithClass(this, CollectedDocumentPageStartIterator.class);
			pageContext.getOut().print(theCollectedDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

