package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameListENIterator theGroup = (GroupNameListENIterator)findAncestorWithClass(this, GroupNameListENIterator.class);
			pageContext.getOut().print(theGroup.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

