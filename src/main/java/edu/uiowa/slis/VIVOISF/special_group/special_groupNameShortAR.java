package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortARIterator thespecial_group = (special_groupNameShortARIterator)findAncestorWithClass(this, special_groupNameShortARIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

