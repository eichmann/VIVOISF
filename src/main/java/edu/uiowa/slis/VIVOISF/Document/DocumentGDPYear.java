package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentGDPYearIterator theDocument = (DocumentGDPYearIterator)findAncestorWithClass(this, DocumentGDPYearIterator.class);
			pageContext.getOut().print(theDocument.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

