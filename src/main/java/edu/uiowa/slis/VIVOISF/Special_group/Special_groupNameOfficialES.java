package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialESIterator theSpecial_group = (Special_groupNameOfficialESIterator)findAncestorWithClass(this, Special_groupNameOfficialESIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

