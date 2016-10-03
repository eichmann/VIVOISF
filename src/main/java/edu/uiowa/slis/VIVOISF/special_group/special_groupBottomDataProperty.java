package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupBottomDataPropertyIterator thespecial_group = (special_groupBottomDataPropertyIterator)findAncestorWithClass(this, special_groupBottomDataPropertyIterator.class);
			pageContext.getOut().print(thespecial_group.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

