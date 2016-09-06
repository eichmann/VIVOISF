package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCitedByIterator theDocumentPartCitedByIterator = (DocumentPartCitedByIterator)findAncestorWithClass(this, DocumentPartCitedByIterator.class);
			pageContext.getOut().print(theDocumentPartCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

