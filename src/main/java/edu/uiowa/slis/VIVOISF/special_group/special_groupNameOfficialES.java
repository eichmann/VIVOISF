package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialESIterator thespecial_group = (special_groupNameOfficialESIterator)findAncestorWithClass(this, special_groupNameOfficialESIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

