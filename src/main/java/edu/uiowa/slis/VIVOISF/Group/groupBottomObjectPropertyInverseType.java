package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupBottomObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupBottomObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupBottomObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupBottomObjectPropertyInverseIterator thegroupBottomObjectPropertyInverseIterator = (groupBottomObjectPropertyInverseIterator)findAncestorWithClass(this, groupBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thegroupBottomObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

