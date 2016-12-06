package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCountryAreaTotalIterator theDocument = (DocumentCountryAreaTotalIterator)findAncestorWithClass(this, DocumentCountryAreaTotalIterator.class);
			pageContext.getOut().print(theDocument.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

