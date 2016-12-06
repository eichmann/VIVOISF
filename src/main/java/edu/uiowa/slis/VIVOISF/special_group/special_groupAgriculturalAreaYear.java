package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupAgriculturalAreaYearIterator thespecial_group = (special_groupAgriculturalAreaYearIterator)findAncestorWithClass(this, special_groupAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thespecial_group.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

