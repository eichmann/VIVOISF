package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(groupBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupBottomObjectPropertyIterator thegroupBottomObjectPropertyIterator = (groupBottomObjectPropertyIterator)findAncestorWithClass(this, groupBottomObjectPropertyIterator.class);
			pageContext.getOut().print(thegroupBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing group for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

