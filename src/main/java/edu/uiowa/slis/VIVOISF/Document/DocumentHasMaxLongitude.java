package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHasMaxLongitudeIterator theDocument = (DocumentHasMaxLongitudeIterator)findAncestorWithClass(this, DocumentHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theDocument.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

