package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupSourceCreatorIterator thespecial_group = (special_groupSourceCreatorIterator)findAncestorWithClass(this, special_groupSourceCreatorIterator.class);
			pageContext.getOut().print(thespecial_group.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

