package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupValidUntilIterator theSpecial_group = (Special_groupValidUntilIterator)findAncestorWithClass(this, Special_groupValidUntilIterator.class);
			pageContext.getOut().print(theSpecial_group.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

