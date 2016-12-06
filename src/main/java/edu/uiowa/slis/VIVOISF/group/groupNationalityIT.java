package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityITIterator thegroup = (groupNationalityITIterator)findAncestorWithClass(this, groupNationalityITIterator.class);
			pageContext.getOut().print(thegroup.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

