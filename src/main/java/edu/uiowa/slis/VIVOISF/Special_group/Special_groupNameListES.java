package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListESIterator theSpecial_group = (Special_groupNameListESIterator)findAncestorWithClass(this, Special_groupNameListESIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

