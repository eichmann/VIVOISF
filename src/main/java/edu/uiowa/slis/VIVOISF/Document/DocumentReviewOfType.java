package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentReviewOfIterator theDocumentReviewOfIterator = (DocumentReviewOfIterator)findAncestorWithClass(this, DocumentReviewOfIterator.class);
			pageContext.getOut().print(theDocumentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

