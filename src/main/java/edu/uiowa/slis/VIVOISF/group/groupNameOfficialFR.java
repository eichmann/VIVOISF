package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialFRIterator thegroup = (groupNameOfficialFRIterator)findAncestorWithClass(this, groupNameOfficialFRIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

