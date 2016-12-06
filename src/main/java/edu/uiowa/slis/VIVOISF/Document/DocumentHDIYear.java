package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHDIYearIterator theDocument = (DocumentHDIYearIterator)findAncestorWithClass(this, DocumentHDIYearIterator.class);
			pageContext.getOut().print(theDocument.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

