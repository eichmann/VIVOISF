package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentReproducesIterator theDocumentReproducesIterator = (DocumentReproducesIterator)findAncestorWithClass(this, DocumentReproducesIterator.class);
			pageContext.getOut().print(theDocumentReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

