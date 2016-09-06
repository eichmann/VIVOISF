package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentCitedByIterator theDocumentCitedByIterator = (DocumentCitedByIterator)findAncestorWithClass(this, DocumentCitedByIterator.class);
			pageContext.getOut().print(theDocumentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

