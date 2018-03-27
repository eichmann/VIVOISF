package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyIsDefinedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyIsDefinedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyIsDefinedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyIsDefinedByIterator theDatatypeProperty = (DatatypePropertyIsDefinedByIterator)findAncestorWithClass(this, DatatypePropertyIsDefinedByIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getIsDefinedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for isDefinedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for isDefinedBy tag ");
		}
		return SKIP_BODY;
	}
}

