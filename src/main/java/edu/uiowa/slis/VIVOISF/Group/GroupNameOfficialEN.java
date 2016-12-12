package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupNameOfficialENIterator theGroup = (GroupNameOfficialENIterator)findAncestorWithClass(this, GroupNameOfficialENIterator.class);
			pageContext.getOut().print(theGroup.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

