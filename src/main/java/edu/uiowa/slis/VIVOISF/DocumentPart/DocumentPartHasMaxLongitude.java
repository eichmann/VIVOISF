package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasMaxLongitudeIterator theDocumentPart = (DocumentPartHasMaxLongitudeIterator)findAncestorWithClass(this, DocumentPartHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theDocumentPart.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

