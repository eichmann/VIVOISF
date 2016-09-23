package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSameAsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSameAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSameAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupSameAsIterator thespecial_groupSameAsIterator = (special_groupSameAsIterator)findAncestorWithClass(this, special_groupSameAsIterator.class);
			pageContext.getOut().print(thespecial_groupSameAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

