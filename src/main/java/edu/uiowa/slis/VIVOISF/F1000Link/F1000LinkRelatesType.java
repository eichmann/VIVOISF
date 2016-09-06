package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			F1000LinkRelatesIterator theF1000LinkRelatesIterator = (F1000LinkRelatesIterator)findAncestorWithClass(this, F1000LinkRelatesIterator.class);
			pageContext.getOut().print(theF1000LinkRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for relates tag ");
		}
		return SKIP_BODY;
	}
}

