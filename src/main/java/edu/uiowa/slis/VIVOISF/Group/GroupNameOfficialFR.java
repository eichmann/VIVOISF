package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialFRIterator theGroup = (GroupNameOfficialFRIterator)findAncestorWithClass(this, GroupNameOfficialFRIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

