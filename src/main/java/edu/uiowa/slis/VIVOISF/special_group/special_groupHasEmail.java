package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasEmailIterator thespecial_groupHasEmailIterator = (special_groupHasEmailIterator)findAncestorWithClass(this, special_groupHasEmailIterator.class);
			pageContext.getOut().print(thespecial_groupHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

