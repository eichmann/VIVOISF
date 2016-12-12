package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListARIterator theSpecial_group = (Special_groupNameListARIterator)findAncestorWithClass(this, Special_groupNameListARIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

