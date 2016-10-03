package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(groupTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupTopDataPropertyIterator thegroup = (groupTopDataPropertyIterator)findAncestorWithClass(this, groupTopDataPropertyIterator.class);
			pageContext.getOut().print(thegroup.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing group for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

