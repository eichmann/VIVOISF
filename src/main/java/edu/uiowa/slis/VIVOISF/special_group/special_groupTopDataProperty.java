package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupTopDataPropertyIterator thespecial_group = (special_groupTopDataPropertyIterator)findAncestorWithClass(this, special_groupTopDataPropertyIterator.class);
			pageContext.getOut().print(thespecial_group.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

