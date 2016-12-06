package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialITIterator thegroup = (groupNameOfficialITIterator)findAncestorWithClass(this, groupNameOfficialITIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

