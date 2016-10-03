package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(otherBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherBottomDataPropertyIterator theother = (otherBottomDataPropertyIterator)findAncestorWithClass(this, otherBottomDataPropertyIterator.class);
			pageContext.getOut().print(theother.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing other for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

