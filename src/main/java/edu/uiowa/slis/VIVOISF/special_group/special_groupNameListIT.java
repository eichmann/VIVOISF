package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListITIterator thespecial_group = (special_groupNameListITIterator)findAncestorWithClass(this, special_groupNameListITIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

