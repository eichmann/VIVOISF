package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(groupLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupLandAreaYearIterator thegroup = (groupLandAreaYearIterator)findAncestorWithClass(this, groupLandAreaYearIterator.class);
			pageContext.getOut().print(thegroup.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing group for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

