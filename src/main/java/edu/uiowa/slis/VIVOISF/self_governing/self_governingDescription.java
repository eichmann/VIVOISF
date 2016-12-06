package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingDescriptionIterator theself_governing = (self_governingDescriptionIterator)findAncestorWithClass(this, self_governingDescriptionIterator.class);
			pageContext.getOut().print(theself_governing.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for description tag ");
		}
		return SKIP_BODY;
	}
}

