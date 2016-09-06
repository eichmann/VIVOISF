package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentCitesIterator theDocumentCitesIterator = (DocumentCitesIterator)findAncestorWithClass(this, DocumentCitesIterator.class);
			pageContext.getOut().print(theDocumentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for cites tag ");
		}
		return SKIP_BODY;
	}
}

