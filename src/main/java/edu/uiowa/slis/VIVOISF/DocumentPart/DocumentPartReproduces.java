package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartReproducesIterator theDocumentPartReproducesIterator = (DocumentPartReproducesIterator)findAncestorWithClass(this, DocumentPartReproducesIterator.class);
			pageContext.getOut().print(theDocumentPartReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

