package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupGDPYearIterator thespecial_group = (special_groupGDPYearIterator)findAncestorWithClass(this, special_groupGDPYearIterator.class);
			pageContext.getOut().print(thespecial_group.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

