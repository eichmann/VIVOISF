package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupTopObjectPropertyInverseIterator thegroupTopObjectPropertyInverseIterator = (groupTopObjectPropertyInverseIterator)findAncestorWithClass(this, groupTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thegroupTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

