package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortARIterator theSpecial_group = (Special_groupNameShortARIterator)findAncestorWithClass(this, Special_groupNameShortARIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

