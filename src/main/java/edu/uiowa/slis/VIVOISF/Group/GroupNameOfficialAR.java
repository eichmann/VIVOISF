package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialARIterator theGroup = (GroupNameOfficialARIterator)findAncestorWithClass(this, GroupNameOfficialARIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

