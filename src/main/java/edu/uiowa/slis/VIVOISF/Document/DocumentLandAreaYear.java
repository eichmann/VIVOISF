package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLandAreaYearIterator theDocument = (DocumentLandAreaYearIterator)findAncestorWithClass(this, DocumentLandAreaYearIterator.class);
			pageContext.getOut().print(theDocument.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

