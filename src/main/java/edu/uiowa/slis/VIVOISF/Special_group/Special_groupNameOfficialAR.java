package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialARIterator theSpecial_group = (Special_groupNameOfficialARIterator)findAncestorWithClass(this, Special_groupNameOfficialARIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

