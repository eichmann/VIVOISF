package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGDPYearIterator theDocumentPart = (DocumentPartGDPYearIterator)findAncestorWithClass(this, DocumentPartGDPYearIterator.class);
			pageContext.getOut().print(theDocumentPart.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

