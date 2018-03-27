package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertySourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertySourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertySourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertySourceIdentifierIterator theDatatypeProperty = (DatatypePropertySourceIdentifierIterator)findAncestorWithClass(this, DatatypePropertySourceIdentifierIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

