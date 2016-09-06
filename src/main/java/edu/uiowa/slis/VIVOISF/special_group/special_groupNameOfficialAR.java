package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialARIterator thespecial_group = (special_groupNameOfficialARIterator)findAncestorWithClass(this, special_groupNameOfficialARIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

