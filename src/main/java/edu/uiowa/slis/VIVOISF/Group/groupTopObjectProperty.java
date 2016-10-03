package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupTopObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(groupTopObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupTopObjectPropertyIterator thegroupTopObjectPropertyIterator = (groupTopObjectPropertyIterator)findAncestorWithClass(this, groupTopObjectPropertyIterator.class);
			pageContext.getOut().print(thegroupTopObjectPropertyIterator.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing group for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

