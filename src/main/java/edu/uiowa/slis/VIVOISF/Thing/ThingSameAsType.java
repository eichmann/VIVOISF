package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSameAsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSameAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSameAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingSameAsIterator theThingSameAsIterator = (ThingSameAsIterator)findAncestorWithClass(this, ThingSameAsIterator.class);
			pageContext.getOut().print(theThingSameAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

