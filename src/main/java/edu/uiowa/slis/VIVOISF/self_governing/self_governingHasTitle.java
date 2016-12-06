package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasTitleIterator theself_governingHasTitleIterator = (self_governingHasTitleIterator)findAncestorWithClass(this, self_governingHasTitleIterator.class);
			pageContext.getOut().print(theself_governingHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

