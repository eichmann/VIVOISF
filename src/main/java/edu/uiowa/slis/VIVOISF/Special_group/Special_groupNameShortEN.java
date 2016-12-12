package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameShortENIterator theSpecial_group = (Special_groupNameShortENIterator)findAncestorWithClass(this, Special_groupNameShortENIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

