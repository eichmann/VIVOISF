package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialFRIterator theSpecial_group = (Special_groupNameOfficialFRIterator)findAncestorWithClass(this, Special_groupNameOfficialFRIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

