package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCites currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentCitesIterator theDocumentCitesIterator = (DocumentCitesIterator)findAncestorWithClass(this, DocumentCitesIterator.class);
			pageContext.getOut().print(theDocumentCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for cites tag ");
		}
		return SKIP_BODY;
	}
}

