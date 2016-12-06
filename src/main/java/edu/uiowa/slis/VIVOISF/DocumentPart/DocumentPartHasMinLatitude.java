package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasMinLatitudeIterator theDocumentPart = (DocumentPartHasMinLatitudeIterator)findAncestorWithClass(this, DocumentPartHasMinLatitudeIterator.class);
			pageContext.getOut().print(theDocumentPart.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

