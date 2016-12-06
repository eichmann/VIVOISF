package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHDIYearIterator theDocumentPart = (DocumentPartHDIYearIterator)findAncestorWithClass(this, DocumentPartHDIYearIterator.class);
			pageContext.getOut().print(theDocumentPart.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

