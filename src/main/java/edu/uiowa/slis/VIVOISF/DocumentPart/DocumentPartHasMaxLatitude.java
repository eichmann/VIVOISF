package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasMaxLatitudeIterator theDocumentPart = (DocumentPartHasMaxLatitudeIterator)findAncestorWithClass(this, DocumentPartHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theDocumentPart.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

