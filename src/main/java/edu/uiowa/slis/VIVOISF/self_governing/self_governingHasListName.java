package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasListNameIterator theself_governing = (self_governingHasListNameIterator)findAncestorWithClass(this, self_governingHasListNameIterator.class);
			pageContext.getOut().print(theself_governing.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

