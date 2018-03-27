package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertySourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertySourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertySourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertySourceCreatorIterator theDatatypeProperty = (DatatypePropertySourceCreatorIterator)findAncestorWithClass(this, DatatypePropertySourceCreatorIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

