package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRelatesIterator theself_governingRelatesIterator = (self_governingRelatesIterator)findAncestorWithClass(this, self_governingRelatesIterator.class);
			pageContext.getOut().print(theself_governingRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for relates tag ");
		}
		return SKIP_BODY;
	}
}

