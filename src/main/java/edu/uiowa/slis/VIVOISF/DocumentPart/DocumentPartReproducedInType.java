package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartReproducedInIterator theDocumentPartReproducedInIterator = (DocumentPartReproducedInIterator)findAncestorWithClass(this, DocumentPartReproducedInIterator.class);
			pageContext.getOut().print(theDocumentPartReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

