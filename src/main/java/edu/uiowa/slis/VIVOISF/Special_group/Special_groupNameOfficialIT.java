package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialITIterator theSpecial_group = (Special_groupNameOfficialITIterator)findAncestorWithClass(this, Special_groupNameOfficialITIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

