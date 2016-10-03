package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentReviewOfIterator theCollectedDocumentReviewOfIterator = (CollectedDocumentReviewOfIterator)findAncestorWithClass(this, CollectedDocumentReviewOfIterator.class);
			pageContext.getOut().print(theCollectedDocumentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

