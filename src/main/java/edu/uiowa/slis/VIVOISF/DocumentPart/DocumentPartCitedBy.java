package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCitedByIterator theDocumentPartCitedByIterator = (DocumentPartCitedByIterator)findAncestorWithClass(this, DocumentPartCitedByIterator.class);
			pageContext.getOut().print(theDocumentPartCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

