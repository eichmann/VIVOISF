package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyDescriptionAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyDescriptionAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyDescriptionAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyDescriptionAnnotIterator theDatatypeProperty = (DatatypePropertyDescriptionAnnotIterator)findAncestorWithClass(this, DatatypePropertyDescriptionAnnotIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getDescriptionAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for descriptionAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for descriptionAnnot tag ");
		}
		return SKIP_BODY;
	}
}

