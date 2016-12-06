package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupRelatesIterator thespecial_groupRelatesIterator = (special_groupRelatesIterator)findAncestorWithClass(this, special_groupRelatesIterator.class);
			pageContext.getOut().print(thespecial_groupRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for relates tag ");
		}
		return SKIP_BODY;
	}
}

