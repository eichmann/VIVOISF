package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListITIterator theSpecial_group = (Special_groupNameListITIterator)findAncestorWithClass(this, Special_groupNameListITIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

