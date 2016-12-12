package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameListENIterator theSpecial_group = (Special_groupNameListENIterator)findAncestorWithClass(this, Special_groupNameListENIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

