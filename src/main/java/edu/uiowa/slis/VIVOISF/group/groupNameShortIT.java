package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortITIterator thegroup = (groupNameShortITIterator)findAncestorWithClass(this, groupNameShortITIterator.class);
			pageContext.getOut().print(thegroup.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

