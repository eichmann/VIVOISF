package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasNameIterator thespecial_groupHasNameIterator = (special_groupHasNameIterator)findAncestorWithClass(this, special_groupHasNameIterator.class);
			pageContext.getOut().print(thespecial_groupHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasName tag ");
		}
		return SKIP_BODY;
	}
}

