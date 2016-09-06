package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCites currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCitesIterator theDocumentPartCitesIterator = (DocumentPartCitesIterator)findAncestorWithClass(this, DocumentPartCitesIterator.class);
			pageContext.getOut().print(theDocumentPartCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for cites tag ");
		}
		return SKIP_BODY;
	}
}

