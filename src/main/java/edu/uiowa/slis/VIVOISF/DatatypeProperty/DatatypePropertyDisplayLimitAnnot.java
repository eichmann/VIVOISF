package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyDisplayLimitAnnotIterator theDatatypeProperty = (DatatypePropertyDisplayLimitAnnotIterator)findAncestorWithClass(this, DatatypePropertyDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

