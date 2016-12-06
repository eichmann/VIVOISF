package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNationalityENIterator thespecial_group = (special_groupNationalityENIterator)findAncestorWithClass(this, special_groupNationalityENIterator.class);
			pageContext.getOut().print(thespecial_group.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

