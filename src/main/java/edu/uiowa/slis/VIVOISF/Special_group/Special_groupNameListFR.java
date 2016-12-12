package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListFRIterator theSpecial_group = (Special_groupNameListFRIterator)findAncestorWithClass(this, Special_groupNameListFRIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

