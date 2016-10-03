package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartReviewOfIterator theDocumentPartReviewOfIterator = (DocumentPartReviewOfIterator)findAncestorWithClass(this, DocumentPartReviewOfIterator.class);
			pageContext.getOut().print(theDocumentPartReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

