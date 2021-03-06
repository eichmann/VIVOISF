package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRelatedByIterator theDocumentRelatedByIterator = (DocumentRelatedByIterator)findAncestorWithClass(this, DocumentRelatedByIterator.class);
			pageContext.getOut().print(theDocumentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

