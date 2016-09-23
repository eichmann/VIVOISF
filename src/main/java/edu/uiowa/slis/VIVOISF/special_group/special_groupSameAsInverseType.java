package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupSameAsInverseIterator thespecial_groupSameAsInverseIterator = (special_groupSameAsInverseIterator)findAncestorWithClass(this, special_groupSameAsInverseIterator.class);
			pageContext.getOut().print(thespecial_groupSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

