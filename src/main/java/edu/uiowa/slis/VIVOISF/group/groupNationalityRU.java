package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNationalityRUIterator thegroup = (groupNationalityRUIterator)findAncestorWithClass(this, groupNationalityRUIterator.class);
			pageContext.getOut().print(thegroup.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

