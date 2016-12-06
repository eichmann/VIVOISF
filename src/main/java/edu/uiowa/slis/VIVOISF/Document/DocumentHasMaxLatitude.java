package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHasMaxLatitudeIterator theDocument = (DocumentHasMaxLatitudeIterator)findAncestorWithClass(this, DocumentHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theDocument.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

