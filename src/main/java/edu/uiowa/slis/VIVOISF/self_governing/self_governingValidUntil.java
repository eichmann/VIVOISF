package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingValidUntilIterator theself_governing = (self_governingValidUntilIterator)findAncestorWithClass(this, self_governingValidUntilIterator.class);
			pageContext.getOut().print(theself_governing.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

