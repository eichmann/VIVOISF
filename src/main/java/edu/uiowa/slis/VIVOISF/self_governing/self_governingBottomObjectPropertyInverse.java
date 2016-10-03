package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingBottomObjectPropertyInverseIterator theself_governingBottomObjectPropertyInverseIterator = (self_governingBottomObjectPropertyInverseIterator)findAncestorWithClass(this, self_governingBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theself_governingBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

