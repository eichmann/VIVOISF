package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingBottomDataPropertyIterator theself_governing = (self_governingBottomDataPropertyIterator)findAncestorWithClass(this, self_governingBottomDataPropertyIterator.class);
			pageContext.getOut().print(theself_governing.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

