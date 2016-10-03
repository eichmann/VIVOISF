package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingBottomObjectPropertyIterator theself_governingBottomObjectPropertyIterator = (self_governingBottomObjectPropertyIterator)findAncestorWithClass(this, self_governingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theself_governingBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

