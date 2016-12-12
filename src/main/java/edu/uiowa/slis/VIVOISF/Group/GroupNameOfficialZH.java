package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialZHIterator theGroup = (GroupNameOfficialZHIterator)findAncestorWithClass(this, GroupNameOfficialZHIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

