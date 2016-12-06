package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDescriptionIterator theDocumentPart = (DocumentPartDescriptionIterator)findAncestorWithClass(this, DocumentPartDescriptionIterator.class);
			pageContext.getOut().print(theDocumentPart.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for description tag ");
		}
		return SKIP_BODY;
	}
}

