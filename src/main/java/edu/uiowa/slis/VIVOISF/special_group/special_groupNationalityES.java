package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNationalityESIterator thespecial_group = (special_groupNationalityESIterator)findAncestorWithClass(this, special_groupNationalityESIterator.class);
			pageContext.getOut().print(thespecial_group.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

