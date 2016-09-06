package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentReproducesIterator theLegalDocumentReproducesIterator = (LegalDocumentReproducesIterator)findAncestorWithClass(this, LegalDocumentReproducesIterator.class);
			pageContext.getOut().print(theLegalDocumentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

