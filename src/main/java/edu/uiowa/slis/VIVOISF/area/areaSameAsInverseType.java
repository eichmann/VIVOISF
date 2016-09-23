package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaSameAsInverseIterator theareaSameAsInverseIterator = (areaSameAsInverseIterator)findAncestorWithClass(this, areaSameAsInverseIterator.class);
			pageContext.getOut().print(theareaSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

