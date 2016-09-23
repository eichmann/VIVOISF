package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaSameAsInverseIterator theareaSameAsInverseIterator = (areaSameAsInverseIterator)findAncestorWithClass(this, areaSameAsInverseIterator.class);
			pageContext.getOut().print(theareaSameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

