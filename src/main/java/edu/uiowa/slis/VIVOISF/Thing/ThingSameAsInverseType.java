package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingSameAsInverseIterator theThingSameAsInverseIterator = (ThingSameAsInverseIterator)findAncestorWithClass(this, ThingSameAsInverseIterator.class);
			pageContext.getOut().print(theThingSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

