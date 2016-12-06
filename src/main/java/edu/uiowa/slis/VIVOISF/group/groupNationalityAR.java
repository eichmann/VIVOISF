package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityARIterator thegroup = (groupNationalityARIterator)findAncestorWithClass(this, groupNationalityARIterator.class);
			pageContext.getOut().print(thegroup.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

