package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListFRIterator thespecial_group = (special_groupNameListFRIterator)findAncestorWithClass(this, special_groupNameListFRIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

