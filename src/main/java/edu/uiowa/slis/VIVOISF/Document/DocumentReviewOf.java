package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentReviewOfIterator theDocumentReviewOfIterator = (DocumentReviewOfIterator)findAncestorWithClass(this, DocumentReviewOfIterator.class);
			pageContext.getOut().print(theDocumentReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

