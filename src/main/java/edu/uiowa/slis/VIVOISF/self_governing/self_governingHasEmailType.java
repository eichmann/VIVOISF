package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasEmailIterator theself_governingHasEmailIterator = (self_governingHasEmailIterator)findAncestorWithClass(this, self_governingHasEmailIterator.class);
			pageContext.getOut().print(theself_governingHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

