package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasURLIterator theself_governingHasURLIterator = (self_governingHasURLIterator)findAncestorWithClass(this, self_governingHasURLIterator.class);
			pageContext.getOut().print(theself_governingHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

