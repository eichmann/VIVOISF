package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupTopObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupTopObjectPropertyIterator thespecial_groupTopObjectPropertyIterator = (special_groupTopObjectPropertyIterator)findAncestorWithClass(this, special_groupTopObjectPropertyIterator.class);
			pageContext.getOut().print(thespecial_groupTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

