package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyTerm_status extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyTerm_statusIterator theDatatypeProperty = (DatatypePropertyTerm_statusIterator)findAncestorWithClass(this, DatatypePropertyTerm_statusIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for term_status tag ");
		}
		return SKIP_BODY;
	}
}

