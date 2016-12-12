package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialESIterator theGroup = (GroupNameOfficialESIterator)findAncestorWithClass(this, GroupNameOfficialESIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

