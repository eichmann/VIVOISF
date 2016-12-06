package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(groupAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupAgriculturalAreaYearIterator thegroup = (groupAgriculturalAreaYearIterator)findAncestorWithClass(this, groupAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thegroup.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing group for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

