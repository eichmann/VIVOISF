package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasCodeIterator thespecial_group = (special_groupHasCodeIterator)findAncestorWithClass(this, special_groupHasCodeIterator.class);
			pageContext.getOut().print(thespecial_group.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

