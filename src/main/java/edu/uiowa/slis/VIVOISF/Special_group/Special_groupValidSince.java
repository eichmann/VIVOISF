package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupValidSinceIterator theSpecial_group = (Special_groupValidSinceIterator)findAncestorWithClass(this, Special_groupValidSinceIterator.class);
			pageContext.getOut().print(theSpecial_group.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for validSince tag ");
		}
		return SKIP_BODY;
	}
}

