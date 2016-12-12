package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortFRIterator theSpecial_group = (Special_groupNameShortFRIterator)findAncestorWithClass(this, Special_groupNameShortFRIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

