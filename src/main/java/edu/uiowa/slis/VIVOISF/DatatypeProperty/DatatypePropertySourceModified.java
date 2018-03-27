package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertySourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertySourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertySourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertySourceModifiedIterator theDatatypeProperty = (DatatypePropertySourceModifiedIterator)findAncestorWithClass(this, DatatypePropertySourceModifiedIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

