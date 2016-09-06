package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortFRIterator thespecial_group = (special_groupNameShortFRIterator)findAncestorWithClass(this, special_groupNameShortFRIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

