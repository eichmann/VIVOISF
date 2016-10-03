package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupTopObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupTopObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupTopObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupTopObjectPropertyInverseIterator thespecial_groupTopObjectPropertyInverseIterator = (special_groupTopObjectPropertyInverseIterator)findAncestorWithClass(this, special_groupTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thespecial_groupTopObjectPropertyInverseIterator.getTopObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

