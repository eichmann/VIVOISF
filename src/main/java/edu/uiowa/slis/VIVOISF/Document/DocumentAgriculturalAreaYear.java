package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentAgriculturalAreaYearIterator theDocument = (DocumentAgriculturalAreaYearIterator)findAncestorWithClass(this, DocumentAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theDocument.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

