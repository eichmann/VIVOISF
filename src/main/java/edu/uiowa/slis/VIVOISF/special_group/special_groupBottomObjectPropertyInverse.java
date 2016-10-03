package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupBottomObjectPropertyInverseIterator thespecial_groupBottomObjectPropertyInverseIterator = (special_groupBottomObjectPropertyInverseIterator)findAncestorWithClass(this, special_groupBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thespecial_groupBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

