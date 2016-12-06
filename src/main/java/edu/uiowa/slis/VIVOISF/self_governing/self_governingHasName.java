package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasNameIterator theself_governingHasNameIterator = (self_governingHasNameIterator)findAncestorWithClass(this, self_governingHasNameIterator.class);
			pageContext.getOut().print(theself_governingHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasName tag ");
		}
		return SKIP_BODY;
	}
}

