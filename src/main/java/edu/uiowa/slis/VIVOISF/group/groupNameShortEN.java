package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameShortENIterator thegroup = (groupNameShortENIterator)findAncestorWithClass(this, groupNameShortENIterator.class);
			pageContext.getOut().print(thegroup.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

