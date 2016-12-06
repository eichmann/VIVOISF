package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasURLIterator theself_governingHasURLIterator = (self_governingHasURLIterator)findAncestorWithClass(this, self_governingHasURLIterator.class);
			pageContext.getOut().print(theself_governingHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

