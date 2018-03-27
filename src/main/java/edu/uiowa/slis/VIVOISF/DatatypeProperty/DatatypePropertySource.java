package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertySource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertySource currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertySource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertySourceIterator theDatatypeProperty = (DatatypePropertySourceIterator)findAncestorWithClass(this, DatatypePropertySourceIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for source tag ");
		}
		return SKIP_BODY;
	}
}

