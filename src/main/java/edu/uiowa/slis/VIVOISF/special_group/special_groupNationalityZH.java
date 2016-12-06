package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNationalityZHIterator thespecial_group = (special_groupNationalityZHIterator)findAncestorWithClass(this, special_groupNationalityZHIterator.class);
			pageContext.getOut().print(thespecial_group.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

