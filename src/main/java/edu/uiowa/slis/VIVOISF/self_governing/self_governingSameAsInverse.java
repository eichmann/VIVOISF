package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingSameAsInverseIterator theself_governingSameAsInverseIterator = (self_governingSameAsInverseIterator)findAncestorWithClass(this, self_governingSameAsInverseIterator.class);
			pageContext.getOut().print(theself_governingSameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

