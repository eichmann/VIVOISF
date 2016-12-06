package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHasMinLongitudeIterator theDocument = (DocumentHasMinLongitudeIterator)findAncestorWithClass(this, DocumentHasMinLongitudeIterator.class);
			pageContext.getOut().print(theDocument.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

