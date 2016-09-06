package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialITIterator thespecial_group = (special_groupNameOfficialITIterator)findAncestorWithClass(this, special_groupNameOfficialITIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

