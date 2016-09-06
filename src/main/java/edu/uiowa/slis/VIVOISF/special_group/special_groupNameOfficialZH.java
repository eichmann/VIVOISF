package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialZHIterator thespecial_group = (special_groupNameOfficialZHIterator)findAncestorWithClass(this, special_groupNameOfficialZHIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

