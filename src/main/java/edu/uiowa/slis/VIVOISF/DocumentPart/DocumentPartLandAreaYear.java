package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartLandAreaYearIterator theDocumentPart = (DocumentPartLandAreaYearIterator)findAncestorWithClass(this, DocumentPartLandAreaYearIterator.class);
			pageContext.getOut().print(theDocumentPart.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

