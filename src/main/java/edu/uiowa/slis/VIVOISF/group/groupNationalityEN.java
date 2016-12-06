package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityENIterator thegroup = (groupNationalityENIterator)findAncestorWithClass(this, groupNationalityENIterator.class);
			pageContext.getOut().print(thegroup.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

