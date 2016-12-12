package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialENIterator theSpecial_group = (Special_groupNameOfficialENIterator)findAncestorWithClass(this, Special_groupNameOfficialENIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

