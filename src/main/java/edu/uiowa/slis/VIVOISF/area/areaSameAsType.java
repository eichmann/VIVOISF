package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSameAsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSameAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSameAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaSameAsIterator theareaSameAsIterator = (areaSameAsIterator)findAncestorWithClass(this, areaSameAsIterator.class);
			pageContext.getOut().print(theareaSameAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

