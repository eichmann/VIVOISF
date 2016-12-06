package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityFRIterator thegroup = (groupNationalityFRIterator)findAncestorWithClass(this, groupNationalityFRIterator.class);
			pageContext.getOut().print(thegroup.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

