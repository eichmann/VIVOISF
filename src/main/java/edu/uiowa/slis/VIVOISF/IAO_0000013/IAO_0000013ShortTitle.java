package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ShortTitleIterator theIAO_0000013 = (IAO_0000013ShortTitleIterator)findAncestorWithClass(this, IAO_0000013ShortTitleIterator.class);
			pageContext.getOut().print(theIAO_0000013.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

