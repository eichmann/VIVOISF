package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialRUIterator thespecial_group = (special_groupNameOfficialRUIterator)findAncestorWithClass(this, special_groupNameOfficialRUIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

