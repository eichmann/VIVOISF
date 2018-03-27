package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyDescriptionIterator theDatatypeProperty = (DatatypePropertyDescriptionIterator)findAncestorWithClass(this, DatatypePropertyDescriptionIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for description tag ");
		}
		return SKIP_BODY;
	}
}

