package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortITIterator theSpecial_group = (Special_groupNameShortITIterator)findAncestorWithClass(this, Special_groupNameShortITIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

