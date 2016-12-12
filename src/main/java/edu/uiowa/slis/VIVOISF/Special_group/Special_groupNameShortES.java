package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortESIterator theSpecial_group = (Special_groupNameShortESIterator)findAncestorWithClass(this, Special_groupNameShortESIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

