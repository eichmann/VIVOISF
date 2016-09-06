package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortITIterator thespecial_group = (special_groupNameShortITIterator)findAncestorWithClass(this, special_groupNameShortITIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

