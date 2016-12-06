package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCountryAreaYearIterator theDocumentPart = (DocumentPartCountryAreaYearIterator)findAncestorWithClass(this, DocumentPartCountryAreaYearIterator.class);
			pageContext.getOut().print(theDocumentPart.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

