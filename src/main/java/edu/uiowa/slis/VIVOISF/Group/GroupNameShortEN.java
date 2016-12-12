package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameShortENIterator theGroup = (GroupNameShortENIterator)findAncestorWithClass(this, GroupNameShortENIterator.class);
			pageContext.getOut().print(theGroup.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

