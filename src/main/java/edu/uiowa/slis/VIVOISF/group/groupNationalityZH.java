package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityZHIterator thegroup = (groupNationalityZHIterator)findAncestorWithClass(this, groupNationalityZHIterator.class);
			pageContext.getOut().print(thegroup.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

