package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentReproducedInIterator theDocumentReproducedInIterator = (DocumentReproducedInIterator)findAncestorWithClass(this, DocumentReproducedInIterator.class);
			pageContext.getOut().print(theDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

