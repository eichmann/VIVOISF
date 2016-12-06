package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasMinLongitudeIterator theDocumentPart = (DocumentPartHasMinLongitudeIterator)findAncestorWithClass(this, DocumentPartHasMinLongitudeIterator.class);
			pageContext.getOut().print(theDocumentPart.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

