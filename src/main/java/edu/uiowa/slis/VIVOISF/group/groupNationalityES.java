package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityESIterator thegroup = (groupNationalityESIterator)findAncestorWithClass(this, groupNationalityESIterator.class);
			pageContext.getOut().print(thegroup.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

