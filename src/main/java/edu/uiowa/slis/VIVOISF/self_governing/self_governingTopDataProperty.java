package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingTopDataPropertyIterator theself_governing = (self_governingTopDataPropertyIterator)findAncestorWithClass(this, self_governingTopDataPropertyIterator.class);
			pageContext.getOut().print(theself_governing.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

