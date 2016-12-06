package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupMiddleNameIterator thespecial_group = (special_groupMiddleNameIterator)findAncestorWithClass(this, special_groupMiddleNameIterator.class);
			pageContext.getOut().print(thespecial_group.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for middleName tag ");
		}
		return SKIP_BODY;
	}
}

