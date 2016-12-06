package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialESIterator thegroup = (groupNameOfficialESIterator)findAncestorWithClass(this, groupNameOfficialESIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

