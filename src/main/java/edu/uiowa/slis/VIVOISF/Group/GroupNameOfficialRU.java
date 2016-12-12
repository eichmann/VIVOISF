package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialRUIterator theGroup = (GroupNameOfficialRUIterator)findAncestorWithClass(this, GroupNameOfficialRUIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

