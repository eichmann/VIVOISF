package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCountryAreaTotalIterator theDocumentPart = (DocumentPartCountryAreaTotalIterator)findAncestorWithClass(this, DocumentPartCountryAreaTotalIterator.class);
			pageContext.getOut().print(theDocumentPart.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

