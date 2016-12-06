package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRelatedByIterator theDocumentPartRelatedByIterator = (DocumentPartRelatedByIterator)findAncestorWithClass(this, DocumentPartRelatedByIterator.class);
			pageContext.getOut().print(theDocumentPartRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

