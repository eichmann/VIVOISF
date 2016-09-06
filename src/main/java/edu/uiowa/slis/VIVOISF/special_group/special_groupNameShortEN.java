package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameShortENIterator thespecial_group = (special_groupNameShortENIterator)findAncestorWithClass(this, special_groupNameShortENIterator.class);
			pageContext.getOut().print(thespecial_group.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

