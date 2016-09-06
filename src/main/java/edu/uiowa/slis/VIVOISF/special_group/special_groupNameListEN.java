package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameListENIterator thespecial_group = (special_groupNameListENIterator)findAncestorWithClass(this, special_groupNameListENIterator.class);
			pageContext.getOut().print(thespecial_group.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

