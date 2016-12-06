package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(groupGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupGDPYearIterator thegroup = (groupGDPYearIterator)findAncestorWithClass(this, groupGDPYearIterator.class);
			pageContext.getOut().print(thegroup.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing group for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

