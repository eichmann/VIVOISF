package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHDIYearIterator thegroup = (groupHDIYearIterator)findAncestorWithClass(this, groupHDIYearIterator.class);
			pageContext.getOut().print(thegroup.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing group for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

