package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingValidSinceIterator theself_governing = (self_governingValidSinceIterator)findAncestorWithClass(this, self_governingValidSinceIterator.class);
			pageContext.getOut().print(theself_governing.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for validSince tag ");
		}
		return SKIP_BODY;
	}
}

