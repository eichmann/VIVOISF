package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNationalityRUIterator thespecial_group = (special_groupNationalityRUIterator)findAncestorWithClass(this, special_groupNationalityRUIterator.class);
			pageContext.getOut().print(thespecial_group.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

