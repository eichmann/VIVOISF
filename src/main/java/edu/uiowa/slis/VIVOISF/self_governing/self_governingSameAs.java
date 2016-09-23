package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingSameAsIterator theself_governing = (self_governingSameAsIterator)findAncestorWithClass(this, self_governingSameAsIterator.class);
			pageContext.getOut().print(theself_governing.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

