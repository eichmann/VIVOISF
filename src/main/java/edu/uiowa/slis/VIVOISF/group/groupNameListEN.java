package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameListENIterator thegroup = (groupNameListENIterator)findAncestorWithClass(this, groupNameListENIterator.class);
			pageContext.getOut().print(thegroup.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

