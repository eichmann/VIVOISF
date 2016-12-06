package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialRUIterator thegroup = (groupNameOfficialRUIterator)findAncestorWithClass(this, groupNameOfficialRUIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

