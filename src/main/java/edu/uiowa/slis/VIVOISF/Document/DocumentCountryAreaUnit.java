package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCountryAreaUnitIterator theDocument = (DocumentCountryAreaUnitIterator)findAncestorWithClass(this, DocumentCountryAreaUnitIterator.class);
			pageContext.getOut().print(theDocument.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

