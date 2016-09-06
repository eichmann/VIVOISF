package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameOfficialENIterator thespecial_group = (special_groupNameOfficialENIterator)findAncestorWithClass(this, special_groupNameOfficialENIterator.class);
			pageContext.getOut().print(thespecial_group.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

