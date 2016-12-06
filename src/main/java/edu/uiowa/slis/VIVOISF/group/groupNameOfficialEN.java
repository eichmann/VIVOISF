package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameOfficialENIterator thegroup = (groupNameOfficialENIterator)findAncestorWithClass(this, groupNameOfficialENIterator.class);
			pageContext.getOut().print(thegroup.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

