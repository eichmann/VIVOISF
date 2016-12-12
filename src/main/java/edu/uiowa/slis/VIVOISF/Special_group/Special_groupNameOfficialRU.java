package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialRUIterator theSpecial_group = (Special_groupNameOfficialRUIterator)findAncestorWithClass(this, Special_groupNameOfficialRUIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

