package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasShortNameIterator theself_governing = (self_governingHasShortNameIterator)findAncestorWithClass(this, self_governingHasShortNameIterator.class);
			pageContext.getOut().print(theself_governing.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

