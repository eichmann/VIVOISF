package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialZHIterator thegroup = (groupNameOfficialZHIterator)findAncestorWithClass(this, groupNameOfficialZHIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

