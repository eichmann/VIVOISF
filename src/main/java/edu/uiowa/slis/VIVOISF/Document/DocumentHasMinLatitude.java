package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHasMinLatitudeIterator theDocument = (DocumentHasMinLatitudeIterator)findAncestorWithClass(this, DocumentHasMinLatitudeIterator.class);
			pageContext.getOut().print(theDocument.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

