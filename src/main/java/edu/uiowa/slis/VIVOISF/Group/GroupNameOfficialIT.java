package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialITIterator theGroup = (GroupNameOfficialITIterator)findAncestorWithClass(this, GroupNameOfficialITIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

