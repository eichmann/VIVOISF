package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialARIterator thegroup = (groupNameOfficialARIterator)findAncestorWithClass(this, groupNameOfficialARIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

