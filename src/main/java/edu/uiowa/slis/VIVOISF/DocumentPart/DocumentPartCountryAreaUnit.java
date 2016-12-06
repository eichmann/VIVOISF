package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCountryAreaUnitIterator theDocumentPart = (DocumentPartCountryAreaUnitIterator)findAncestorWithClass(this, DocumentPartCountryAreaUnitIterator.class);
			pageContext.getOut().print(theDocumentPart.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

