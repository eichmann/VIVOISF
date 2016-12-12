package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortZHIterator theSpecial_group = (Special_groupNameShortZHIterator)findAncestorWithClass(this, Special_groupNameShortZHIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

