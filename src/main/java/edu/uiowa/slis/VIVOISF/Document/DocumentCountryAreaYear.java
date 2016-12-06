package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCountryAreaYearIterator theDocument = (DocumentCountryAreaYearIterator)findAncestorWithClass(this, DocumentCountryAreaYearIterator.class);
			pageContext.getOut().print(theDocument.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

