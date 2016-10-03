package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPages currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPagesIterator theDocumentPart = (DocumentPartPagesIterator)findAncestorWithClass(this, DocumentPartPagesIterator.class);
			pageContext.getOut().print(theDocumentPart.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for pages tag ");
		}
		return SKIP_BODY;
	}
}

