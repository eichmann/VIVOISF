package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortESIterator thespecial_group = (special_groupNameShortESIterator)findAncestorWithClass(this, special_groupNameShortESIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

