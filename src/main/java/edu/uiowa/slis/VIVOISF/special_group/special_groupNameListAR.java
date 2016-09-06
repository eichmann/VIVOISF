package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListARIterator thespecial_group = (special_groupNameListARIterator)findAncestorWithClass(this, special_groupNameListARIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

